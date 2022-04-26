package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Servicio;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioServicio {
    void crear(Servicio servicio);
    boolean existe(String nombre);
}
