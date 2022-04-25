package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoFactura {
    private int idFactura;
    private int total;
    private Date fechaCompra;
    private int idMascota;

    public DtoFactura(){}
}
