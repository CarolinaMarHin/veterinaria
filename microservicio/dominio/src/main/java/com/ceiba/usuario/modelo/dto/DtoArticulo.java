package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoArticulo {
    private int idArticulo;
    private int precio;
    private int cantidad;
    private int idServicio;
    private int idFactura;

    public DtoArticulo(){}
}
