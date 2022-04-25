package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoMascota {
    private int idMascota;
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private int peso;

    public DtoMascota(){}
}
