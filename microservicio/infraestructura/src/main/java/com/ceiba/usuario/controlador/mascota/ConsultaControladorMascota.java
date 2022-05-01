package com.ceiba.usuario.controlador.mascota;

import com.ceiba.usuario.consulta.ManejadorObtenerMascota;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascota")
public class ConsultaControladorMascota {

    private final ManejadorObtenerMascota manejadorObtenerMascota;

    @Autowired
    public ConsultaControladorMascota(ManejadorObtenerMascota manejadorObtenerMascota) {
        this.manejadorObtenerMascota = manejadorObtenerMascota;
    }

    @GetMapping(value="/obtenerMascotaCodigo/{codigoMascota}")
    @ApiOperation("Obtener mascota")
    public DtoMascota obtenerMascota(@PathVariable String codigoMascota) {
        return this.manejadorObtenerMascota.ejecutar(codigoMascota);
    }

}
