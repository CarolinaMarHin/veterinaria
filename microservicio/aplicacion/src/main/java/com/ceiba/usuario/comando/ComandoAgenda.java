package com.ceiba.usuario.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ComandoAgenda {

    private String codigoAgenda;
    private Date fechaAgenda;
    private boolean estadoAgenda;
}
