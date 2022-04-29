package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name="cita")
public class Cita {

    @Id
    @Column(name="codigo_cita")
    private String codigoCita;

    @Column(name="codigo_agenda")
    private String codigoAgenda;

    @Column(name="codigo_mascota")
    private String codigoMascota;

    @Column(name="cedula_veterinario")
    private String cedulaVeterinario;

    @Column(name="codigo_servicio")
    private String codigoServicio;

    public Cita(String codigoCita, String codigoAgenda, String codigoMascota, String cedulaVeterinario, String codigoServicio) {
        this.codigoCita = codigoCita;
        this.codigoAgenda = codigoAgenda;
        this.codigoMascota = codigoMascota;
        this.cedulaVeterinario = cedulaVeterinario;
        this.codigoServicio = codigoServicio;
    }
}
