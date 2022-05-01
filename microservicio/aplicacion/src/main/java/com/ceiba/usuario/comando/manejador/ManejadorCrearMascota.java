package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionMascota;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.modelo.entidad.Mascota;
import com.ceiba.usuario.servicio.ServicioCrearMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ManejadorCrearMascota implements ManejadorComandoRespuesta<DtoMascota, ComandoRespuesta<Long>>{

    private final CreacionMascota creacionMascota;
    private final ServicioCrearMascota servicioCrearMascota;

    @Autowired
    public ManejadorCrearMascota(CreacionMascota creacionMascota, ServicioCrearMascota servicioCrearMascota) {
        this.creacionMascota = creacionMascota;
        this.servicioCrearMascota = servicioCrearMascota;
    }

    public ComandoRespuesta<Long> ejecutar(DtoMascota dtoMascota) {
       Mascota Mascota = this.creacionMascota.crear(dtoMascota);
       return new ComandoRespuesta<>(this.servicioCrearMascota.ejecutar(Mascota));
    }
}
