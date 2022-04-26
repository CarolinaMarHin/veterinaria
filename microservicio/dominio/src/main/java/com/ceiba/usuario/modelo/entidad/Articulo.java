package com.ceiba.usuario.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo {

    @Id
    @Column(name="id_articulo")
    private int idArticulo;

    @Column(name="precio")
    private int precio;

    @Column(name="cantidad")
    private int cantidad;

    @Column(name="id_servicio")
    private int idServicio;

    @Column(name="id_factura")
    private int idFactura;

    public Articulo(){}
}
