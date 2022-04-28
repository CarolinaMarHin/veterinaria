package com.ceiba.usuario.controlador;

import com.ceiba.usuario.comando.manejador.ManejadorCrearCita;
import com.ceiba.usuario.comando.manejador.ManejadorCrearServicio;
import com.ceiba.usuario.modelo.dto.DtoCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cita")
public class ComandoControladorCita {

    private final ManejadorCrearCita manejadorCrearCita;

    @Autowired
    public ComandoControladorCita(ManejadorCrearCita manejadorCrearCita) {
        this.manejadorCrearCita = manejadorCrearCita;
    }

    @PostMapping
    public String crearCita(@RequestBody DtoCita dtoCita) {
        manejadorCrearCita.ejecutar(dtoCita);
        return "Se creo la Cita" ;
    }

}
