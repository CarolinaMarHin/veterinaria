package com.ceiba.usuario.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoMascota {

    private String codigoMascota;
    private String nombreMascota;
    private String raza;
    private Date fechaNacimientoMascota;
    private int peso;
}
