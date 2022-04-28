package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Factura;

import java.util.List;

public interface RepositorioFactura {
    void crearFactura(List<Factura> facturas);
}
