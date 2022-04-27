package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Servicio;

import java.util.List;

public interface RepositorioServicio {
    void crear(List<Servicio> servicios, String numeroFactura);
    boolean existe(List<Servicio> servicios);
}
