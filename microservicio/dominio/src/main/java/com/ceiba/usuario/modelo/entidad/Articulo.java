package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name="articulo")
public class Articulo {

    @Id
    @Column(name="codigo_articulo")
    private String codigoArticulo;

    @Column(name="nombre_articulo")
    private String nombreArticulo;

    @Column(name="precio_articulo")
    private String precioArticulo;

    public Articulo(){}

    public Articulo(String codigoArticulo, String nombreArticulo, String precioArticulo) {
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.precioArticulo = precioArticulo;
    }
}
