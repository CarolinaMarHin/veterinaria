package com.ceiba.usuario.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="agenda", schema="veterinaria")
public class Agenda {

    @Id
    @Column(name="id_agenda")
    private int idAgenda;

    @Column(name="fecha_cita")
    private Date fechaCita;

    public Agenda(){}
}
