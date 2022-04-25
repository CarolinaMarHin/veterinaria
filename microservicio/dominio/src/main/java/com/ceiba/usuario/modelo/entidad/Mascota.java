package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="mascota", schema="veterinaria")
public class Mascota {

    @Column(name="id_mascota")
    private int idMascota;

    @Column(name="nombre")
    private String nombre;

    @Column(name="raza")
    private String raza;

    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name="peso")
    private int peso;

    public Mascota(){}
}
