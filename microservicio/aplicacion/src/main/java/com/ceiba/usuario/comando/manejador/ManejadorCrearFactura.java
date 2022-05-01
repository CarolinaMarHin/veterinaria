package com.ceiba.usuario.comando.manejador;

import com.ceiba.usuario.comando.fabrica.CreacionFactura;
import com.ceiba.usuario.modelo.dto.DtoFactura;
import com.ceiba.usuario.modelo.entidad.Factura;
import com.ceiba.usuario.servicio.ServicioCrearFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorCrearFactura {
// implements ManejadorComandoRespuesta<DtoFactura, ComandoRespuesta<Long>>
    private CreacionFactura creacionFactura;
    private ServicioCrearFactura servicioCrearFactura;

    @Autowired
    public ManejadorCrearFactura(CreacionFactura creacionFactura, ServicioCrearFactura servicioCrearFactura) {
        this.creacionFactura = creacionFactura;
        this.servicioCrearFactura = servicioCrearFactura;
    }

    public void ejecutar(DtoFactura dtoFactura) {
        List<Factura> facturas = this.creacionFactura.crear(dtoFactura);
       this.servicioCrearFactura.ejecutar(facturas);
    }
}
