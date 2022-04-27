package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.modelo.entidad.Mascota;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class CreacionMascota {
    public Mascota crear(DtoMascota dtoMascota) {
        long fechaNacimientoSql = dtoMascota.getFechaNacimiento().getTime();
        Date fechaNacimientoBD = new Date(fechaNacimientoSql);

        return new Mascota(
                dtoMascota.getNombre(),
                dtoMascota.getRaza(),
                fechaNacimientoBD,
                dtoMascota.getPeso(),
                dtoMascota.getCodigo()
        );
    }

    public CreacionMascota() {
    }
}
