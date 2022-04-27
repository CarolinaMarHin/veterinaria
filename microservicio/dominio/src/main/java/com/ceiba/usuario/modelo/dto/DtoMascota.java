package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoMascota {
    private String codigoMascota;
    private String nombreMascota;
    private String raza;
    private Date fechaNacimientoMascota;
    private int peso;

    public DtoMascota(){}

    public DtoMascota(String codigoMascota, String nombreMascota, String raza, Date fechaNacimientoMascota, int peso) {
        this.codigoMascota = codigoMascota;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.fechaNacimientoMascota = fechaNacimientoMascota;
        this.peso = peso;
    }
}
