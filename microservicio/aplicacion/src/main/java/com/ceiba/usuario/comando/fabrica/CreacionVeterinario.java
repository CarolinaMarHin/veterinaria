package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoVeterinario;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class CreacionVeterinario {
    public Veterinario crear(DtoVeterinario dtoVeterinario) {
        long fechaNacimientoVeterinarioSql = dtoVeterinario.getFechaNacimientoVeterinario().getTime();
        Date fechaNacimientoVeterinarioBD = new Date(fechaNacimientoVeterinarioSql);

        return new Veterinario(
                dtoVeterinario.getNombreVeterinario(),
                dtoVeterinario.getCedulaVeterinario(),
                fechaNacimientoVeterinarioBD
        );
    }

    public CreacionVeterinario() {
    }
}
