package com.ceiba.usuario.servicio.testdatabuilder.articulo;

import com.ceiba.usuario.comando.ComandoArticulo;

import java.util.UUID;

public class ComandoArticuloTestDataBuilder {

    private final String codigoArticulo;
    private final String nombreArticulo;
    private final String precioArticulo;

    public ComandoArticuloTestDataBuilder() {
        codigoArticulo = UUID.randomUUID().toString().substring(1, 8);
        nombreArticulo = "Baño";
        precioArticulo = "25000";

    }

    public ComandoArticulo build() {
        return new ComandoArticulo(codigoArticulo, nombreArticulo, precioArticulo);
    }
}
