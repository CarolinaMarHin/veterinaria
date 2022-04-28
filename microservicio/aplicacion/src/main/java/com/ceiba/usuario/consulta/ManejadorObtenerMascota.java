package com.ceiba.usuario.consulta;

import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.puerto.dao.DaoMascota;
import org.springframework.stereotype.Component;

@Component
public class ManejadorObtenerMascota {

    private final DaoMascota daoMascota;

    public ManejadorObtenerMascota(DaoMascota daoMascota){
        this.daoMascota = daoMascota;
    }

    public DtoMascota ejecutar(String codigoMascota){
        return this.daoMascota.obtenerMascota(codigoMascota);
    }
}
