package com.ceiba.usuario.comando;

import com.ceiba.usuario.modelo.dto.DtoServicio;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
public class ComandoFactura {
    private int codigoFactura;
    private int totalFactura;
    private Date fechaCompra;
    private String codigoMascota;
    private String numeroFactura;
    private List<DtoServicio> servicios;
}
