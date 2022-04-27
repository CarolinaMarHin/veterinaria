package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="veterinario")
public class Veterinario {

    @Id
    @Column(name="cedula_veterinario")
    private String cedulaVeterinario;

    @Column(name="nombre_veterinario")
    private String nombreVeterinario;

    @Column(name="fecha_nacimiento_veterinario")
    private Date fechaNacimientoVeterinario;

    public Veterinario(){}

    public Veterinario(String cedulaVeterinario, String nombreVeterinario, Date fechaNacimientoVeterinario) {
        this.cedulaVeterinario = cedulaVeterinario;
        this.nombreVeterinario = nombreVeterinario;
        this.fechaNacimientoVeterinario = fechaNacimientoVeterinario;
    }
}
