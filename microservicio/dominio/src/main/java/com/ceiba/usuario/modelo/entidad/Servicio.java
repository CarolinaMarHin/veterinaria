package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="servicio")
public class Servicio {

    @Id
    @Column(name="id_servicio")
    private int idServicio;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private String precio;

    @Column(name="cantidad")
    private int cantidad;

    @Column(name="codigo")
    private String codigo;

    public Servicio(){}

    public Servicio(String nombre, String precio, int cantidad, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }
}
