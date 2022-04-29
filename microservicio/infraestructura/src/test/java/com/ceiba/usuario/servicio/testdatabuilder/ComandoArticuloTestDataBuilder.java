package com.ceiba.usuario.servicio.testdatabuilder;

import com.ceiba.usuario.comando.ComandoArticulo;

import java.util.UUID;

public class ComandoArticuloTestDataBuilder {

    private String codigoArticulo;
    private String nombreArticulo;
    private String precioArticulo;

    public ComandoArticuloTestDataBuilder() {
        codigoArticulo = UUID.randomUUID().toString();
        nombreArticulo = "Baño";
        precioArticulo = "25000";

    }

    public ComandoArticulo build() {
        return new ComandoArticulo(codigoArticulo, nombreArticulo, precioArticulo);
    }
}
