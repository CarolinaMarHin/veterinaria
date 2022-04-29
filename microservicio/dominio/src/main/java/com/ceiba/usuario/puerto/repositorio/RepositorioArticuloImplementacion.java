package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Articulo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RepositorioArticuloImplementacion implements RepositorioArticulo {

    private EntityManager entityManager;

    @Override
    public void crear(Articulo articulo) {
        entityManager.createNativeQuery("INSERT INTO Articulo(codigo_articulo, nombre_articulo, precio_articulo) VALUES (:codigo_articulo, :nombre_articulo, :precio_articulo)")
                .setParameter("codigo_articulo", articulo.getCodigoArticulo())
                .setParameter("nombre_articulo", articulo.getNombreArticulo())
                .setParameter("precio_articulo", articulo.getPrecioArticulo())
                .executeUpdate();
    }

    @Override
    public boolean existe(String codigoArticulo) {
        List articulosExistente = entityManager.createQuery(
                        "SELECT codigo_articulo FROM Articulo a WHERE a.codigo_articulo = :codigoArticulo")
                .setParameter("codigoArticulo", codigoArticulo)
                .getResultList();
        return !articulosExistente.isEmpty();
    }
}
