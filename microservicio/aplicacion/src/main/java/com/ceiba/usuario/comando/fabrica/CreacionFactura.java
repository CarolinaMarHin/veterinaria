package com.ceiba.usuario.comando.fabrica;

import com.ceiba.usuario.modelo.dto.DtoFactura;
import com.ceiba.usuario.modelo.entidad.Factura;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreacionFactura {
    public List<Factura> crear(DtoFactura dtoFactura) {
        long fechaCompraSql = dtoFactura.getFechaCompra().getTime();
        Date fechaCompraBD = new Date(fechaCompraSql);

        List<Factura> itemFacturas = new ArrayList<>();

        dtoFactura.getServicios().forEach(dtoServicio -> {
            Factura factura = new Factura(dtoFactura.getTotalFactura(), fechaCompraBD, dtoFactura.getCodigoMascota(), dtoServicio.getCodigoServicio(), dtoFactura.getNumeroFactura());
            itemFacturas.add(factura);
        });

        return itemFacturas;
    }

    public CreacionFactura() {
    }
}
