package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCita {
    private int idCita;
    private int idAgenda;
    private int idMascota;
    private int idVeterinario;
    private int idServicio;

    public DtoCita(){}
}
