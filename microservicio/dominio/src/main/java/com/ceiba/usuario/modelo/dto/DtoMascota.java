package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoMascota {
    private String codigoMascota;
    private String nombreMascota;
    private String raza;
    private Date fechaNacimientoMascota;
    private int peso;
}
