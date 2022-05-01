package com.ceiba.usuario.controlador.veterinario;

import com.ceiba.usuario.comando.manejador.ManejadorCrearVeterinario;
import com.ceiba.usuario.modelo.dto.DtoVeterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veterinario")
public class ComandoControladorVeterinario {

    private final ManejadorCrearVeterinario manejadorCrearVeterinario;

    @Autowired
    public ComandoControladorVeterinario(ManejadorCrearVeterinario manejadorCrearVeterinario) {
        this.manejadorCrearVeterinario = manejadorCrearVeterinario;
    }

    @PostMapping
    public String crearVeterinario(@RequestBody DtoVeterinario dtoVeterinario) {
        manejadorCrearVeterinario.ejecutar(dtoVeterinario);
        return "Se creo el veterinario" ;
    }

}
