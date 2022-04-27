package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Articulo;
import com.ceiba.usuario.puerto.repositorio.RepositorioArticulo;

public class ServicioCrearArticulo {

    private static final String EL_ARTICULO_YA_EXISTE_EN_EL_SISTEMA = "El articulo ya existe en el sistema";

    private RepositorioArticulo repositorioArticulo;

    public ServicioCrearArticulo(RepositorioArticulo repositorioArticulo) {
        this.repositorioArticulo = repositorioArticulo;
    }

    public void ejecutar(Articulo articulo) {
        validarExistenciaPrevia(articulo);
        this.repositorioArticulo.crear(articulo);
    }

    private void validarExistenciaPrevia(Articulo articulo) {
        boolean existe = this.repositorioArticulo.existe(articulo.getCodigoArticulo());
        if (existe) {
            throw new ExcepcionDuplicidad(EL_ARTICULO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}

