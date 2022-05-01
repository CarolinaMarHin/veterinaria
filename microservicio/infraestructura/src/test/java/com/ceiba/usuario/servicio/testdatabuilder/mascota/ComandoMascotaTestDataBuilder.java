package com.ceiba.usuario.servicio.testdatabuilder.mascota;

import com.ceiba.usuario.comando.ComandoMascota;

import java.util.Date;
import java.util.UUID;

public class ComandoMascotaTestDataBuilder {

    private final String codigoMascota;
    private final String nombreMascota;
    private final String raza;
    private final Date fechaNacimientoMascota;
    private final int peso;

    public ComandoMascotaTestDataBuilder() {
        codigoMascota = UUID.randomUUID().toString().substring(1, 8);
        nombreMascota = "1478";
        raza = "Criollo";
        fechaNacimientoMascota = new Date();
        peso = 30;

    }

    public ComandoMascota build() {
        return new ComandoMascota(codigoMascota, nombreMascota, raza, fechaNacimientoMascota, peso);
    }
}
