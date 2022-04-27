package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.manejador.ManejadorCrearServicio;
import com.ceiba.usuario.modelo.dto.DtoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicio")
public class ComandoControladorServicio {

    private final ManejadorCrearServicio manejadorCrearServicio;

    @Autowired
    public ComandoControladorServicio(ManejadorCrearServicio manejadorCrearServicio) {
        this.manejadorCrearServicio = manejadorCrearServicio;
    }

    @PostMapping
    public String crearServicio(@RequestBody DtoServicio dtoServicio) {
        manejadorCrearServicio.ejecutar(dtoServicio);
        return "Se creo el servicio";
    }

}
