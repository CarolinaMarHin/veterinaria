package com.ceiba.usuario.controlador.mascota;

import com.ceiba.ComandoRespuesta;
import com.ceiba.usuario.comando.manejador.ManejadorCrearMascota;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascota")
public class ComandoControladorMascota {

    private final ManejadorCrearMascota manejadorCrearMascota;

    @Autowired
    public ComandoControladorMascota(ManejadorCrearMascota manejadorCrearMascota) {
        this.manejadorCrearMascota = manejadorCrearMascota;
    }

    @PostMapping
    public ComandoRespuesta<Long> crearMascota(@RequestBody DtoMascota dtoMascota) {
        return manejadorCrearMascota.ejecutar(dtoMascota);
    }

}
