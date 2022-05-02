package com.ceiba.usuario.servicio;

import com.ceiba.usuario.modelo.entidad.Factura;
import com.ceiba.usuario.puerto.repositorio.RepositorioFactura;
import org.springframework.stereotype.Service;

import java.util.List;

public class ServicioCrearFactura {
    private RepositorioFactura repositorioFactura;

    public ServicioCrearFactura(RepositorioFactura repositorioFactura) {
        this.repositorioFactura = repositorioFactura;
    }

    public void ejecutar(List<Factura> facturas) {
        this.repositorioFactura.crearFactura(facturas);
    }
}
