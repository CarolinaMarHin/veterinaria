package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.manejador.ManejadorCrearAgenda;
import com.ceiba.usuario.modelo.dto.DtoAgenda;
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
    public String crearAgenda(@RequestBody DtoAgenda dtoAgenda) {
        manejadorCrearAgenda.ejecutar(dtoAgenda);
        return "Se creo el Agenda";
    }

}
