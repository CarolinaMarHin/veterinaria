package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoMascota;

import java.util.Date;
import java.util.UUID;

public class ComandoMascotaTestDataBuilder {

    private String codigoMascota;
    private String nombreMascota;
    private String raza;
    private Date fechaNacimientoMascota;
    private int peso;

    public ComandoMascotaTestDataBuilder() {
        codigoMascota = UUID.randomUUID().toString();
        nombreMascota = "1478";
        raza = "Criollo";
        fechaNacimientoMascota = new Date();
        peso = 30;

    }

    public ComandoMascota build() {
        return new ComandoMascota(codigoMascota, nombreMascota, raza, fechaNacimientoMascota, peso);
    }
}
