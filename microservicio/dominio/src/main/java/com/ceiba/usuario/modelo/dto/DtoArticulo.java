package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoArticulo {
    private String codigoArticulo;
    private String nombreArticulo;
    private String precioArticulo;
}
