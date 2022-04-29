package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.manejador.ComandoVeterinario;

import java.util.Date;

public class ComandoVeterinarioTestDataBuilder {


    private String nombreVeterinario;
    private String cedulaVeterinario;
    private Date fechaNacimientoVeterinario;

    public ComandoVeterinarioTestDataBuilder() {
        nombreVeterinario = "Carolina Marin";
        cedulaVeterinario = "15965";
        fechaNacimientoVeterinario = new Date();
    }

    public ComandoVeterinario build() {
        return new ComandoVeterinario(nombreVeterinario, cedulaVeterinario, fechaNacimientoVeterinario);
    }
}
