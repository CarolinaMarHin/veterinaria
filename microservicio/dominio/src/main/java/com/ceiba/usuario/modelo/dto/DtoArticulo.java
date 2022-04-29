package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DtoArticulo {
    private String codigoArticulo;
    private String nombreArticulo;
    private String precioArticulo;

    public DtoArticulo(){}
}
