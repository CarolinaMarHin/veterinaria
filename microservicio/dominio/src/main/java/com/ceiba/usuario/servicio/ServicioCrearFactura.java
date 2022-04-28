package com.ceiba.usuario.servicio;

import com.ceiba.usuario.modelo.entidad.Factura;
import com.ceiba.usuario.puerto.repositorio.RepositorioFactura;

import java.util.List;

public class ServicioCrearFactura {

    private static final String EL_FACTURA_YA_EXISTE_EN_EL_SISTEMA = "La factura ya existe en el sistema";

    private RepositorioFactura repositorioFactura;

    public ServicioCrearFactura(RepositorioFactura repositorioFactura) {
        this.repositorioFactura = repositorioFactura;
    }

    public void ejecutar(List<Factura> facturas) {
        this.repositorioFactura.crearFactura(facturas);
    }
}
