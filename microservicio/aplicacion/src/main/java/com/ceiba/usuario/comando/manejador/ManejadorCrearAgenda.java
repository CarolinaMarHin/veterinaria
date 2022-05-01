package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionAgenda;
import com.ceiba.usuario.modelo.dto.DtoAgenda;
import com.ceiba.usuario.modelo.entidad.Agenda;
import com.ceiba.usuario.servicio.ServicioCrearAgenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearAgenda implements ManejadorComandoRespuesta<DtoAgenda, ComandoRespuesta<Long>> {

    private CreacionAgenda creacionAgenda;
    private ServicioCrearAgenda servicioCrearAgenda;

    @Autowired
    public ManejadorCrearAgenda(CreacionAgenda creacionAgenda, ServicioCrearAgenda servicioCrearAgenda) {
        this.creacionAgenda = creacionAgenda;
        this.servicioCrearAgenda = servicioCrearAgenda;
    }

    public ComandoRespuesta<Long> ejecutar(DtoAgenda dtoAgenda) {
       Agenda agenda = this.creacionAgenda.crear(dtoAgenda);
       return new ComandoRespuesta<>(this.servicioCrearAgenda.ejecutar(agenda));
    }
}
