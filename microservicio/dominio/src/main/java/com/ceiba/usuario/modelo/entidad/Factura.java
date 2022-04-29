package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Entity
@Table(name="factura")
public class Factura {

    @Id
    @Column(name="codigo_factura")
    private int codigoFactura;

    @Column(name="total_factura")
    private int totalFactura;

    @Column(name="fecha_compra")
    private Date fechaCompra;

    @Column(name="codigo_mascota")
    private String codigoMascota;

    @Column(name="codigo_servicio")
    private String codigoServicio;

    @Column(name="numero_factura")
    private String numeroFactura;

    public Factura(){}

    public Factura(int totalFactura, Date fechaCompra, String codigoMascota, String codigoServicio, String numeroFactura) {
        this.totalFactura = totalFactura;
        this.fechaCompra = fechaCompra;
        this.codigoMascota = codigoMascota;
        this.codigoServicio = codigoServicio;
        this.numeroFactura = numeroFactura;
    }
}
