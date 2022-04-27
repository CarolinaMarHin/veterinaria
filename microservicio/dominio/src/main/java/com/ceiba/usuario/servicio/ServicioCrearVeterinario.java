package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import com.ceiba.usuario.puerto.repositorio.RepositorioVeterinario;

public class ServicioCrearVeterinario {

    private static final String EL_VETERINARIO_YA_EXISTE_EN_EL_SISTEMA = "El veterinario ya existe en el sistema";

    private RepositorioVeterinario repositorioValidacion;

    public ServicioCrearVeterinario(RepositorioVeterinario repositorioValidacion) {
        this.repositorioValidacion = repositorioValidacion;
    }

    public void ejecutar(Veterinario veterinario) {
        validarExistenciaPrevia(veterinario);
        this.repositorioValidacion.crear(veterinario);
    }

    private void validarExistenciaPrevia(Veterinario veterinario) {
        boolean existe = this.repositorioValidacion.existe(veterinario.getCedula());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_VETERINARIO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
