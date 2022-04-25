package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoServicio {
    private int idServicio;
    private String nombre;
    private String precio;
    private int cantidad;

    public DtoServicio(){}
}
