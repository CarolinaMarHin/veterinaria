package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="veterinario")
public class Veterinario {

    @Id
    @Column(name="id_veterinario")
    private int idVeterinario;

    @Column(name="nombre")
    private String nombre;

    @Column(name="cedula")
    private String cedula;

    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;

    public Veterinario(){}
}
