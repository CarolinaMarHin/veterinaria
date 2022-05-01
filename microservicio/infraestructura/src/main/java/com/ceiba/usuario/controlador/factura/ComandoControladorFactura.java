package com.ceiba.usuario.controlador.factura;

import com.ceiba.usuario.comando.manejador.ManejadorCrearFactura;
import com.ceiba.usuario.comando.manejador.ManejadorCrearServicio;
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
    private final ManejadorCrearServicio manejadorCrearServicio;

    @Autowired
    public ComandoControladorFactura(ManejadorCrearFactura manejadorCrearFactura, ManejadorCrearServicio manejadorCrearServicio) {
        this.manejadorCrearFactura = manejadorCrearFactura;
        this.manejadorCrearServicio = manejadorCrearServicio;
    }

    @PostMapping
    public String crearFactura(@RequestBody DtoFactura dtoFactura) {
        manejadorCrearServicio.ejecutar(dtoFactura.getServicios(), dtoFactura.getNumeroFactura());
        manejadorCrearFactura.ejecutar(dtoFactura);
        return "Se creo la Factura" ;
    }

}
