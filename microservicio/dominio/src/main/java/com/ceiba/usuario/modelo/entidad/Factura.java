package com.ceiba.usuario.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="factura")
public class Factura {

    @Id
    @Column(name="id_factura")
    private int idFactura;

    @Column(name="total")
    private int total;

    @Column(name="fecha_compra")
    private Date fechaCompra;

    @Column(name="id_mascota")
    private int idMascota;

    public Factura(){}
}
