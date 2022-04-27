package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.entidad.Servicio;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicio {
    public Servicio crear(DtoServicio dtoServicio) {
        return new Servicio(
                dtoServicio.getNombre(),
                dtoServicio.getPrecio(),
                dtoServicio.getCantidad()
        );
    }

    public CreacionServicio() {
    }
}
