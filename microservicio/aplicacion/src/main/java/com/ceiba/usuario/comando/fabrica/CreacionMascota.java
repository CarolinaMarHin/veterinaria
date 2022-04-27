package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.modelo.entidad.Mascota;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class CreacionMascota {
    public Mascota crear(DtoMascota dtoMascota) {
        long fechaNacimientoMascotaSql = dtoMascota.getFechaNacimientoMascota().getTime();
        Date fechaNacimientoMascotaBD = new Date(fechaNacimientoMascotaSql);

        return new Mascota(
                dtoMascota.getCodigoMascota(),
                dtoMascota.getNombreMascota(),
                dtoMascota.getRaza(),
                fechaNacimientoMascotaBD,
                dtoMascota.getPeso()
        );
    }

    public CreacionMascota() {
    }
}
