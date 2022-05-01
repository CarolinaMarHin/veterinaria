package com.ceiba.usuario.controlador.articulo;

import com.ceiba.ComandoRespuesta;
import com.ceiba.usuario.comando.manejador.ManejadorCrearArticulo;
import com.ceiba.usuario.modelo.dto.DtoArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo")
public class ComandoControladorArticulo {

    private final ManejadorCrearArticulo manejadorCrearArticulo;

    @Autowired
    public ComandoControladorArticulo(ManejadorCrearArticulo manejadorCrearArticulo) {
        this.manejadorCrearArticulo = manejadorCrearArticulo;
    }

    @PostMapping
    public ComandoRespuesta<Long> crearArticulo(@RequestBody DtoArticulo dtoArticulo) {
        return manejadorCrearArticulo.ejecutar(dtoArticulo);
    }

}
