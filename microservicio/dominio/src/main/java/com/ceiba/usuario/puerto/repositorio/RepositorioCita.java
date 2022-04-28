package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Cita;

public interface RepositorioCita {
    void crear(Cita cita);
    boolean existe(String codigoCita);
}
