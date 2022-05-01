package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoAgenda {
    private String codigoAgenda;
    private Date fechaAgenda;
    private boolean estadoAgenda;
}
