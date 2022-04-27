package com.ceiba.usuario.consulta;

import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import com.ceiba.usuario.puerto.dao.DaoMascota;
import com.ceiba.usuario.puerto.dao.DaoUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorObtenerMascota {

    private final DaoMascota daoMascota;

    public ManejadorObtenerMascota(DaoMascota daoMascota){
        this.daoMascota = daoMascota;
    }

    public DtoMascota ejecutar(String codigo){
        return this.daoMascota.obtenerMascota(codigo);
    }
}
