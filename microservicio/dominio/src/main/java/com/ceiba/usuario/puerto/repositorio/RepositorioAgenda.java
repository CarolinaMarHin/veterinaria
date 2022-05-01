package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Agenda;

public interface RepositorioAgenda {
    Long crear(Agenda agenda);
    boolean existe(String codigoAgenda);
}
