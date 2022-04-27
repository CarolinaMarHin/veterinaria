package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuestaServicio;
import com.ceiba.usuario.comando.fabrica.CreacionServicio;
import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.entidad.Servicio;
import com.ceiba.usuario.servicio.ServicioCrearServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorCrearServicio implements ManejadorComandoRespuestaServicio<DtoServicio, String, ComandoRespuesta<Long>> {

    private CreacionServicio creacionServicio;
    private ServicioCrearServicio servicioCrearServicio;

    @Autowired
    public ManejadorCrearServicio(CreacionServicio creacionServicio, ServicioCrearServicio servicioCrearServicio) {
        this.creacionServicio = creacionServicio;
        this.servicioCrearServicio = servicioCrearServicio;
    }

    public void ejecutar(List<DtoServicio> dtoServicio, String numeroFactura) {
       List<Servicio> servicios = this.creacionServicio.crear(dtoServicio, numeroFactura);
       this.servicioCrearServicio.ejecutar(servicios, numeroFactura);
    }
}
