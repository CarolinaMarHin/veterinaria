package com.ceiba.usuario.controlador;

import com.ceiba.usuario.consulta.ManejadorObtenerMascota;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascota")
public class ConsultaControladorMascota {

    private final ManejadorObtenerMascota manejadorObtenerMascota;

    public ConsultaControladorMascota(ManejadorObtenerMascota manejadorObtenerMascota) {
        this.manejadorObtenerMascota = manejadorObtenerMascota;
    }

    @GetMapping(value="/obtenerMascotaCodigo")
    public DtoMascota obtenerMascota(@RequestParam String codigoMascota) {
        return this.manejadorObtenerMascota.ejecutar(codigoMascota);
    }

}
