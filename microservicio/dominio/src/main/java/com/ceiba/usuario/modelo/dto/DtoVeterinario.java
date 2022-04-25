package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoVeterinario {
    private int idVeterinario;
    private String nombre;
    private String cedula;
    private Date fechaNacimiento;

    public DtoVeterinario(){}
}
