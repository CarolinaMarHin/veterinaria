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
@Table(name="agenda")
public class Agenda {

    @Id
    @Column(name="codigo_agenda")
    private String codigoAgenda;

    @Column(name="fecha_agenda")
    private Date fechaAgenda;

    @Column(name="estado_agenda")
    private boolean estadoAgenda;

    public Agenda(){}

    public Agenda(String codigoAgenda, Date fechaAgenda, boolean estadoAgenda) {
        this.codigoAgenda = codigoAgenda;
        this.fechaAgenda = fechaAgenda;
        this.estadoAgenda = estadoAgenda;
    }
}
