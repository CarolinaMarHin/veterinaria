package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoServicio;
import com.ceiba.usuario.modelo.entidad.Servicio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreacionServicio {
    public List<Servicio> crear(List<DtoServicio> dtoServicios, String numeroFactura) {
        List<Servicio> itemServicios = new ArrayList<>();

        dtoServicios.forEach(dtoServicio -> {
            Servicio servicio = new Servicio(dtoServicio.getCodigoServicio(), dtoServicio.getNombreServicio(), dtoServicio.getPrecioServicio(), numeroFactura, dtoServicio.getCodigoArticulo());
            itemServicios.add(servicio);
        });

        return itemServicios;
    }

    public CreacionServicio() {
    }
}
