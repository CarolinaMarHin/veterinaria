package com.ceiba.usuario.controlador;

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
    public String crearArticulo(@RequestBody DtoArticulo dtoArticulo) {
        manejadorCrearArticulo.ejecutar(dtoArticulo);
        return "Se creo el articulo";
    }

}
