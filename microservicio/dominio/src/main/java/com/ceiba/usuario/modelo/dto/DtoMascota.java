package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoMascota {
    private int idMascota;
    private String codigo;
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private int peso;

    public DtoMascota(){}

    public DtoMascota(int idMascota, String codigo, String nombre, String raza, Date fechaNacimiento, int peso) {
        this.idMascota = idMascota;
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }
}
