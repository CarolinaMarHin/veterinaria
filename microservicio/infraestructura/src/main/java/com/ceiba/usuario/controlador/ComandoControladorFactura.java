package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.manejador.ManejadorCrearFactura;
import com.ceiba.usuario.modelo.dto.DtoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class ComandoControladorFactura {

    private final ManejadorCrearFactura manejadorCrearFactura;

    @Autowired
    public ComandoControladorFactura(ManejadorCrearFactura manejadorCrearFactura) {
        this.manejadorCrearFactura = manejadorCrearFactura;
    }

    @PostMapping
    public String crearFactura(@RequestBody DtoFactura dtoFactura) {
        manejadorCrearFactura.ejecutar(dtoFactura);
        return "Se creo el Factura" ;
    }

}
