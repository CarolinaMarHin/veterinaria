package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoAgenda;

import java.util.Date;
import java.util.UUID;

public class ComandoAgendaTestDataBuilder {

    private final String codigoAgenda;
    private final Date fechaAgenda;
    private final boolean estadoAgenda;

    public ComandoAgendaTestDataBuilder() {
        codigoAgenda = UUID.randomUUID().toString();
        fechaAgenda = new Date();
        estadoAgenda = false;

    }

    public ComandoAgenda build() {
        return new ComandoAgenda(codigoAgenda, fechaAgenda, estadoAgenda);
    }
}
