package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DtoFactura {
    private int codigoFactura;
    private int totalFactura;
    private Date fechaCompra;
    private String codigoMascota;
    private String numeroFactura;
    private List<DtoServicio> servicios;

    public DtoFactura(){}
}
