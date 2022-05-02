package com.ceiba.usuario.servicio;

import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.puerto.repositorio.RepositorioCita;
import org.springframework.stereotype.Service;

public class ServicioCrearCita {

    private static final String LA_CITA_SE_HA_ASIGNADO = "La cita ya esta agendada";
    private static final String LA_CITA_SE_HA_REASIGNADO = "La cita ya esta agendada";

    private RepositorioCita repositorioCita;

    public ServicioCrearCita(RepositorioCita repositorioCita) {
        this.repositorioCita = repositorioCita;
    }

    public void ejecutar(Cita cita) {
        validarExistenciaPrevia(cita);
        this.repositorioCita.crear(cita);
    }

    private void validarExistenciaPrevia(Cita cita) {
        boolean existe = this.repositorioCita.existe(cita.getCodigoMascota());
    }
}

