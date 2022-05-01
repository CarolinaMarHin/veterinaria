package com.ceiba.usuario.controlador.agenda;

import com.ceiba.ComandoRespuesta;
import com.ceiba.usuario.comando.manejador.ManejadorCrearAgenda;
import com.ceiba.usuario.modelo.dto.DtoAgenda;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class ComandoControladorAgenda {

    private final ManejadorCrearAgenda manejadorCrearAgenda;

    @Autowired
    public ComandoControladorAgenda(ManejadorCrearAgenda manejadorCrearAgenda) {
        this.manejadorCrearAgenda = manejadorCrearAgenda;
    }

    @PostMapping
    @ApiOperation("Crear Agenda")
    public ComandoRespuesta<Long> crearAgenda(@RequestBody DtoAgenda dtoAgenda) {
        return manejadorCrearAgenda.ejecutar(dtoAgenda);
    }

}
