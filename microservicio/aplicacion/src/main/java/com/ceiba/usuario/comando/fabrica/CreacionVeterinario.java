package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.dto.DtoVeterinario;
import com.ceiba.usuario.modelo.entidad.Servicio;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class CreacionVeterinario {
    public Veterinario crear(DtoVeterinario dtoVeterinario) {
        long fechaNacimientoSql = dtoVeterinario.getFechaNacimiento().getTime();
        Date fechaNacimientoBD = new Date(fechaNacimientoSql);

        return new Veterinario(
                dtoVeterinario.getNombre(),
                dtoVeterinario.getCedula(),
                fechaNacimientoBD
        );
    }

    public CreacionVeterinario() {
    }
}
