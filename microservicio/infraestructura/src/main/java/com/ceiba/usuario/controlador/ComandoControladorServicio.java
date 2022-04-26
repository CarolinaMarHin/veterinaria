package com.ceiba.usuario.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.usuario.comando.ComandoServicio;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.comando.manejador.ManejadorActualizarUsuario;
import com.ceiba.usuario.comando.manejador.ManejadorCrearServicio;
import com.ceiba.usuario.comando.manejador.ManejadorCrearUsuario;
import com.ceiba.usuario.comando.manejador.ManejadorEliminarUsuario;
import com.ceiba.usuario.modelo.dto.DtoServicio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
