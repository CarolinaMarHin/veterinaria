package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionCita;
import com.ceiba.usuario.modelo.dto.DtoCita;
import com.ceiba.usuario.modelo.entidad.Cita;
import com.ceiba.usuario.servicio.ServicioCrearCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCita {
// implements ManejadorComandoRespuesta<DtoCita, ComandoRespuesta<Long>>
    private CreacionCita creacionCita;
    private ServicioCrearCita servicioCrearCita;

    @Autowired
    public ManejadorCrearCita(CreacionCita creacionCita, ServicioCrearCita servicioCrearCita) {
        this.creacionCita = creacionCita;
        this.servicioCrearCita = servicioCrearCita;
    }

    public void ejecutar(DtoCita dtoCita) {
       Cita cita = this.creacionCita.crear(dtoCita);
       this.servicioCrearCita.ejecutar(cita);
    }
}
