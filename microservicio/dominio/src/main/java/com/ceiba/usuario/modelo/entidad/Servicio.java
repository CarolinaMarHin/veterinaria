package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="servicio", schema="veterinaria")
public class Servicio {

    @Column(name="id_servicio")
    private int idServicio;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private String precio;

    @Column(name="cantidad")
    private int cantidad;

    public Servicio(){}
}
