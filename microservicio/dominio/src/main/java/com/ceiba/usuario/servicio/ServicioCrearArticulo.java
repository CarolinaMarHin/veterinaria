package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Articulo;
import com.ceiba.usuario.puerto.repositorio.RepositorioArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearArticulo {

    private static final String EL_ARTICULO_YA_EXISTE_EN_EL_SISTEMA = "El articulo ya existe en el sistema";

    private RepositorioArticulo repositorioArticulo;

    @Autowired
    public ServicioCrearArticulo(RepositorioArticulo repositorioArticulo) {
        this.repositorioArticulo = repositorioArticulo;
    }

    public Long ejecutar(Articulo articulo) {
        validarExistenciaPrevia(articulo);
        return this.repositorioArticulo.crear(articulo);
    }

    private void validarExistenciaPrevia(Articulo articulo) {
        boolean existe = this.repositorioArticulo.existe(articulo.getCodigoArticulo());
        if (existe) {
            throw new ExcepcionDuplicidad(EL_ARTICULO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}

