package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class DtoVeterinario {
    private String nombreVeterinario;
    private String cedulaVeterinario;
    private Date fechaNacimientoVeterinario;

    public DtoVeterinario(){}
}
