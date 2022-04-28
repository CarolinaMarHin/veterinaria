package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.entidad.Cita;
import org.springframework.stereotype.Service;

@Service
public class CreacionCita {
    public Cita crear(DtoCita dtoCita) {
        return new Cita(
                dtoCita.getCodigoCita(),
                dtoCita.getCodigoAgenda(),
                dtoCita.getCodigoMascota(),
                dtoCita.getCedulaVeterinario(),
                dtoCita.getCodigoServicio()
        );
    }

    public CreacionCita() {
    }
}
