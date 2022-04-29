package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
public class DtoFactura {
    private int codigoFactura;
    private int totalFactura;
    private Date fechaCompra;
    private String codigoMascota;
    private String numeroFactura;
    private List<DtoServicio> servicios;
}
