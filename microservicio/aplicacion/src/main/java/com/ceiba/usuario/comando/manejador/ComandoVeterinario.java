package com.ceiba.usuario.comando.manejador;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ComandoVeterinario {

    private String nombreVeterinario;
    private String cedulaVeterinario;
    private Date fechaNacimientoVeterinario;
}
