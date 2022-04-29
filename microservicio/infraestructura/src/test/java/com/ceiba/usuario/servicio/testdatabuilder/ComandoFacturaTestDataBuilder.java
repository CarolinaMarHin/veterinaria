package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoFactura;
import com.ceiba.usuario.modelo.dto.DtoServicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComandoFacturaTestDataBuilder {

    private final int codigoFactura;
    private final int totalFactura;
    private final Date fechaCompra;
    private final String codigoMascota;
    private final String numeroFactura;
    private List<DtoServicio> servicios;

    public ComandoFacturaTestDataBuilder() {
        codigoFactura = 123;
        totalFactura = 25000;
        fechaCompra = new Date();
        codigoMascota = "123";
        numeroFactura = "123";

        List<DtoServicio> servicios = new ArrayList<>();
        DtoServicio servicio = new DtoServicio("5", "Baño", "25000", "2");
        servicios.add(servicio);

        servicios.add(servicio);

    }

    public ComandoFactura build() {
        return new ComandoFactura(codigoFactura, totalFactura, fechaCompra, codigoMascota, numeroFactura, servicios);
    }
}
