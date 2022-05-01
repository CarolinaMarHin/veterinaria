package com.ceiba.usuario.servicio.testdatabuilder.agenda;

import com.ceiba.usuario.comando.ComandoAgenda;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

public class ComandoAgendaTestDataBuilder {

    private final String codigoAgenda;
    private final Date fechaAgenda;
    private final boolean estadoAgenda;

    public ComandoAgendaTestDataBuilder() {
        codigoAgenda = UUID.randomUUID().toString().substring(1, 8);
        fechaAgenda = new GregorianCalendar(2022, Calendar.MAY, 04).getTime();
        estadoAgenda = false;

    }

    public ComandoAgenda build() {
        return new ComandoAgenda(codigoAgenda, fechaAgenda, estadoAgenda);
    }
}
