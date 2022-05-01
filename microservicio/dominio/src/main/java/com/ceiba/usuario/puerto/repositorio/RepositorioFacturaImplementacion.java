package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Factura;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioFacturaImplementacion implements RepositorioFactura{

    //@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crearFactura(List<Factura> facturas) {
        facturas.forEach(factura -> {
            entityManager.createNativeQuery("INSERT INTO Factura(total_factura, fecha_compra, codigo_mascota, codigo_servicio, numero_factura) VALUES (:total_factura, :fecha_compra, :codigo_mascota, :codigo_servicio, :numero_factura)")
                    .setParameter("total_factura", factura.getTotalFactura())
                    .setParameter("fecha_compra", factura.getFechaCompra())
                    .setParameter("codigo_mascota", factura.getCodigoMascota())
                    .setParameter("codigo_servicio", factura.getCodigoServicio())
                    .setParameter("numero_factura", factura.getNumeroFactura())
                    .executeUpdate();
        });
    }
}
