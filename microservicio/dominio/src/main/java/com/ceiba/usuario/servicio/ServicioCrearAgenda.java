package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Agenda;
import com.ceiba.usuario.puerto.repositorio.RepositorioAgenda;

public class ServicioCrearAgenda {

    private static final String EL_AGENDA_YA_EXISTE_EN_EL_SISTEMA = "El Agenda ya existe en el sistema";

    private RepositorioAgenda repositorioAgenda;

    public ServicioCrearAgenda(RepositorioAgenda repositorioAgenda) {
        this.repositorioAgenda = repositorioAgenda;
    }

    public void ejecutar(Agenda agenda) {
        validarExistenciaPrevia(agenda);
        this.repositorioAgenda.crear(agenda);
    }

    private void validarExistenciaPrevia(Agenda agenda) {
        boolean existe = this.repositorioAgenda.existe(agenda.getCodigoAgenda());
        if (existe) {
            throw new ExcepcionDuplicidad(EL_AGENDA_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}

