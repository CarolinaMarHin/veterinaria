package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionServicio;
import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.entidad.Servicio;
import com.ceiba.usuario.servicio.ServicioCrearServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearServicio implements ManejadorComandoRespuesta<DtoServicio, ComandoRespuesta<Long>> {

    private CreacionServicio creacionServicio;
    private ServicioCrearServicio servicioCrearServicio;

    @Autowired
    public ManejadorCrearServicio(CreacionServicio creacionServicio, ServicioCrearServicio servicioCrearServicio) {
        this.creacionServicio = creacionServicio;
        this.servicioCrearServicio = servicioCrearServicio;
    }

    public void ejecutar(DtoServicio dtoServicio) {
       Servicio servicio = this.creacionServicio.crear(dtoServicio);
       this.servicioCrearServicio.ejecutar(servicio);
    }
}
