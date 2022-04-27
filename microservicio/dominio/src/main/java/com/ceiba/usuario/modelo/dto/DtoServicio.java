package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoServicio {
    private String codigoServicio;
    private String nombreServicio;
    private String precioServicio;
    private String codigoArticulo;

    public DtoServicio(){}
}
