package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCita {
    private String codigoCita;
    private String codigoAgenda;
    private String codigoMascota;
    private String cedulaVeterinario;
    private String codigoServicio;

    public DtoCita(){}
}
