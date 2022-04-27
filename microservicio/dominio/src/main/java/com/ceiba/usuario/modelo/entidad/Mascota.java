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
    @Column(name="codigo_mascota")
    private String codigoMascota;

    @Column(name="nombre_mascota")
    private String nombreMascota;

    @Column(name="raza")
    private String raza;

    @Column(name="fecha_nacimiento_mascota")
    private Date fechaNacimientoMascota;

    @Column(name="peso")
    private int peso;

    public Mascota(String codigoMascota, String nombreMascota, String raza, Date fechaNacimientoMascota, int peso) {
        this.codigoMascota = codigoMascota;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.fechaNacimientoMascota = fechaNacimientoMascota;
        this.peso = peso;
    }
}
