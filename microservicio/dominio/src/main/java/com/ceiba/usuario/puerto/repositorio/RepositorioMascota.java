package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Mascota;

public interface RepositorioMascota {
    Long crear(Mascota mascota);
    boolean existe(String codigoMascota);
}
