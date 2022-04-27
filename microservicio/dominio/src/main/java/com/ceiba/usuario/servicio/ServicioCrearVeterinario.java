package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import com.ceiba.usuario.puerto.repositorio.RepositorioVeterinario;

public class ServicioCrearVeterinario {

    private static final String EL_VETERINARIO_YA_EXISTE_EN_EL_SISTEMA = "El veterinario ya existe en el sistema";

    private RepositorioVeterinario repositorioVeterinario;

    public ServicioCrearVeterinario(RepositorioVeterinario repositorioVeterinario) {
        this.repositorioVeterinario = repositorioVeterinario;
    }

    public void ejecutar(Veterinario veterinario) {
        validarExistenciaPrevia(veterinario);
        this.repositorioVeterinario.crear(veterinario);
    }

    private void validarExistenciaPrevia(Veterinario veterinario) {
        boolean existe = this.repositorioVeterinario.existe(veterinario.getCedula());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_VETERINARIO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
