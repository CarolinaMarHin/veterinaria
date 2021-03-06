package com.ceiba.usuario.comando.manejador;

import com.ceiba.usuario.comando.fabrica.CreacionVeterinario;
import com.ceiba.usuario.modelo.dto.DtoVeterinario;
import com.ceiba.usuario.modelo.entidad.Veterinario;
import com.ceiba.usuario.servicio.ServicioCrearVeterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// implements ManejadorComandoRespuesta<DtoVeterinario, ComandoRespuesta<Long>>
@Component
public class ManejadorCrearVeterinario {

    private final CreacionVeterinario creacionVeterinario;
    private final ServicioCrearVeterinario servicioCrearVeterinario;

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
