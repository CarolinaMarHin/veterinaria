package com.ceiba.usuario.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cita")
public class Cita {

    @Id
    @Column(name="id_cita")
    private int idCita;

    @Column(name="id_agenda")
    private int idAgenda;

    @Column(name="id_mascota")
    private int idMascota;

    @Column(name="id_veterinario")
    private int idVeterinario;

    @Column(name="id_servicio")
    private int idServicio;

    public Cita(){}
}
