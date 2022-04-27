package com.ceiba.usuario.modelo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoAgenda {
    private String codigoAgenda;
    private Date fechaAgenda;
    private boolean estadoAgenda;

    public DtoAgenda(){}
}
