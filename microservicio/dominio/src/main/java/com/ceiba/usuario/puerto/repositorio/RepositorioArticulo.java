package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Articulo;

public interface RepositorioArticulo {
    Long crear(Articulo articulo);
    boolean existe(String codigoArticulo);
}
