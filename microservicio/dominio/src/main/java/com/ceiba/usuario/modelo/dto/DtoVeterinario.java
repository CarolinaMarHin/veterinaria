package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class DtoVeterinario {
    private String nombreVeterinario;
    private String cedulaVeterinario;
    private Date fechaNacimientoVeterinario;
}
