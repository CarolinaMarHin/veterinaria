package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Entity
@Table(name="agenda")
public class Agenda {

    @Id
    @Column(name="codigo_agenda")
    private final String codigoAgenda;

    @Column(name="fecha_agenda")
    private final Date fechaAgenda;

    @Column(name="estado_agenda")
    private final boolean estadoAgenda;

    public Agenda(String codigoAgenda, Date fechaAgenda, boolean estadoAgenda) {
        this.codigoAgenda = codigoAgenda;
        this.fechaAgenda = fechaAgenda;
        this.estadoAgenda = estadoAgenda;
    }
}
