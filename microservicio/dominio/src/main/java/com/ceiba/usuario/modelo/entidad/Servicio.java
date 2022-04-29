package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name="servicio")
public class Servicio {

    @Id
    @Column(name="codigo_servicio")
    private String codigoServicio;

    @Column(name="nombre_servicio")
    private String nombreServicio;

    @Column(name="precio_servicio")
    private String precioServicio;

    @Column(name="codigo_factura")
    private String codigoFactura;

    @Column(name="codigo_articulo")
    private String codigoArticulo;

    public Servicio(){}

    public Servicio(String codigoServicio, String nombreServicio, String precioServicio, String codigoFactura, String codigoArticulo) {
        this.codigoServicio = codigoServicio;
        this.nombreServicio = nombreServicio;
        this.precioServicio = precioServicio;
        this.codigoFactura = codigoFactura;
        this.codigoArticulo = codigoArticulo;
    }
}
