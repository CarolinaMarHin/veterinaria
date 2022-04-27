package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoArticulo;
import com.ceiba.usuario.modelo.entidad.Articulo;
import org.springframework.stereotype.Service;

@Service
public class CreacionArticulo {
    public Articulo crear(DtoArticulo dtoArticulo) {
        return new Articulo(
                dtoArticulo.getCodigoArticulo(),
                dtoArticulo.getNombreArticulo(),
                dtoArticulo.getPrecioArticulo()
        );
    }

    public CreacionArticulo() {
    }
}
