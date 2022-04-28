package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Servicio;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioServicioImplementacion implements RepositorioServicio {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(List<Servicio> servicios, String numeroFactura) {
        servicios.forEach(servicio -> {
            entityManager.createNativeQuery("INSERT INTO Servicio(codigo_servicio, nombre_servicio, precio_servicio, codigo_factura, codigo_articulo) VALUES (:codigo_servicio, :nombre_servicio, :precio_servicio, :numeroFactura, :codigo_articulo)")
                    .setParameter("codigo_servicio", servicio.getCodigoServicio())
                    .setParameter("nombre_servicio", servicio.getNombreServicio())
                    .setParameter("precio_servicio", servicio.getPrecioServicio())
                    .setParameter("numeroFactura", numeroFactura)
                    .setParameter("codigo_articulo", servicio.getCodigoArticulo())
                    .executeUpdate();
        });
    }

    @Override
    public boolean existe(List<Servicio> servicios) {
        List serviciosExistente = new ArrayList<>();
        servicios.forEach(servicio -> {
            serviciosExistente.addAll(entityManager.createQuery(
                            "SELECT codigoServicio FROM Servicio s WHERE s.codigoServicio = :codigoServicio")
                    .setParameter("codigoServicio", servicio.getCodigoServicio())
                    .getResultList());
        });
        return !serviciosExistente.isEmpty();
    }
}
