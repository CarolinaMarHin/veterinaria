package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Factura;
import com.ceiba.usuario.modelo.entidad.Servicio;

import java.util.List;

public interface RepositorioFactura {
    void crearFactura(List<Factura> facturas);
}
