package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoAgenda;
import com.ceiba.usuario.modelo.entidad.Agenda;
import org.springframework.stereotype.Service;

@Service
public class CreacionAgenda {
    public Agenda crear(DtoAgenda dtoAgenda) {
        return new Agenda(
                dtoAgenda.getCodigoAgenda(),
                dtoAgenda.getFechaAgenda(),
                dtoAgenda.isEstadoAgenda()
        );
    }

    public CreacionAgenda() {
    }
}
