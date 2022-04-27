package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionServicio;
import com.ceiba.usuario.comando.fabrica.CreacionVeterinario;
import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.dto.DtoVeterinario;
import com.ceiba.usuario.modelo.entidad.Servicio;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import com.ceiba.usuario.servicio.ServicioCrearServicio;
import com.ceiba.usuario.servicio.ServicioCrearVeterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearVeterinario implements ManejadorComandoRespuesta<DtoVeterinario, ComandoRespuesta<Long>> {

    private CreacionVeterinario creacionVeterinario;
    private ServicioCrearVeterinario servicioCrearVeterinario;

    @Autowired
    public ManejadorCrearVeterinario(CreacionVeterinario creacionVeterinario, ServicioCrearVeterinario servicioCrearVeterinario) {
        this.creacionVeterinario = creacionVeterinario;
        this.servicioCrearVeterinario = servicioCrearVeterinario;
    }

    public void ejecutar(DtoVeterinario dtoVeterinario) {
       Veterinario veterinario = this.creacionVeterinario.crear(dtoVeterinario);
       this.servicioCrearVeterinario.ejecutar(veterinario);
    }
}
