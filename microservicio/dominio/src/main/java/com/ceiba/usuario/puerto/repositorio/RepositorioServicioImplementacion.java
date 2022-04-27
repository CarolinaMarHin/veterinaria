package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Servicio;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioServicioImplementacion implements RepositorioServicio{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Servicio servicio) {
        entityManager.createNativeQuery("INSERT INTO Servicio(nombre, precio, cantidad) VALUES (:nombre, :precio, :cantidad)")
                .setParameter("nombre", servicio.getNombre())
                .setParameter("precio", servicio.getPrecio())
                .setParameter("cantidad", servicio.getCantidad())
                .executeUpdate();
    }

    @Override
    public boolean existe(String nombre) {
        List serviciosExistente = entityManager.createQuery(
                        "SELECT nombre FROM Servicio s WHERE s.nombre = :nombre")
                .setParameter("nombre", nombre)
                .getResultList();
        return !serviciosExistente.isEmpty();
    }
}
