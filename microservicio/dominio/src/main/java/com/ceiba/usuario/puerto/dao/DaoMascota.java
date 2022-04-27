package com.ceiba.usuario.puerto.dao;

import com.ceiba.usuario.modelo.dto.DtoMascota;

public interface DaoMascota {
    DtoMascota obtenerMascota(String codigoMascota);
}
