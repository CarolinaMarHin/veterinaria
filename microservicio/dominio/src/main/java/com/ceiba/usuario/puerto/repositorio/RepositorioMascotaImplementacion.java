package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Mascota;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioMascotaImplementacion implements RepositorioMascota{

    //@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Mascota mascota) {
        entityManager.createNativeQuery("INSERT INTO Mascota(codigo_mascota, nombre_mascota, raza, fecha_nacimiento_mascota, peso) VALUES (:codigoMascota, :nombreMascota, :raza, :fechaNacimientoMascota, :peso)")
                .setParameter("codigoMascota", mascota.getCodigoMascota())
                .setParameter("nombreMascota", mascota.getNombreMascota())
                .setParameter("raza", mascota.getRaza())
                .setParameter("fechaNacimientoMascota", mascota.getFechaNacimientoMascota())
                .setParameter("peso", mascota.getPeso())
                .executeUpdate();
    }

    @Override
    public boolean existe(String codigoMascota) {
        List mascotaExistente = entityManager.createQuery(
                        "SELECT codigoMascota FROM Mascota m WHERE m.codigoMascota = :codigoMascota")
                .setParameter("codigoMascota", codigoMascota)
                .getResultList();
        return !mascotaExistente.isEmpty();
    }
}
