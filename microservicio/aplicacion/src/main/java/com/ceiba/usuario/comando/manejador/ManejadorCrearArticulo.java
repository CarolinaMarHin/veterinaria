package com.ceiba.usuario.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.usuario.comando.fabrica.CreacionArticulo;
import com.ceiba.usuario.modelo.dto.DtoArticulo;
import com.ceiba.usuario.modelo.entidad.Articulo;
import com.ceiba.usuario.servicio.ServicioCrearArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// implements ManejadorComandoRespuesta<DtoArticulo, ComandoRespuesta<Long>>
@Component
public class ManejadorCrearArticulo{

    private CreacionArticulo creacionArticulo;
    private ServicioCrearArticulo servicioCrearArticulo;

    @Autowired
    public ManejadorCrearArticulo(CreacionArticulo creacionArticulo, ServicioCrearArticulo servicioCrearArticulo) {
        this.creacionArticulo = creacionArticulo;
        this.servicioCrearArticulo = servicioCrearArticulo;
    }

    public ComandoRespuesta<Long> ejecutar(DtoArticulo dtoArticulo) {
       Articulo articulo = this.creacionArticulo.crear(dtoArticulo);
        return new ComandoRespuesta<>(this.servicioCrearArticulo.ejecutar(articulo));
    }
}
