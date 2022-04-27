package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="mascota")
public class Mascota {

    @Id
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

    @Column(name="codigo")
    private String codigo;

    public Mascota(String nombre, String raza, Date fechaNacimiento, int peso, String codigo) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.codigo = codigo;
    }
}
