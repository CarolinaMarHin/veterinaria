package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Mascota;
import com.ceiba.usuario.puerto.repositorio.RepositorioMascota;

public class ServicioCrearMascota {

    private static final String EL_MASCOTA_YA_EXISTE_EN_EL_SISTEMA = "La mascota ya existe en el sistema";

    private RepositorioMascota repositorioMascota;

    public ServicioCrearMascota(RepositorioMascota repositorioMascota) {
        this.repositorioMascota = repositorioMascota;
    }

    public void ejecutar(Mascota mascota) {
        validarExistenciaPrevia(mascota);
        this.repositorioMascota.crear(mascota);
    }

    private void validarExistenciaPrevia(Mascota mascota) {
        boolean existe = this.repositorioMascota.existe(mascota.getCodigo());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_MASCOTA_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
