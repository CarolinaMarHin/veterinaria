package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Mascota;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioMascotaImplementacion implements RepositorioMascota{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Mascota mascota) {
        entityManager.createNativeQuery("INSERT INTO Mascota(nombre, raza, fecha_nacimiento, peso, codigo) VALUES (:nombre, :raza, :fechaNacimiento, :peso, :codigo)")
                .setParameter("nombre", mascota.getNombre())
                .setParameter("raza", mascota.getRaza())
                .setParameter("fechaNacimiento", mascota.getFechaNacimiento())
                .setParameter("peso", mascota.getPeso())
                .setParameter("codigo", mascota.getCodigo())
                .executeUpdate();
    }

    @Override
    public boolean existe(String codigo) {
        List MascotaExistente = entityManager.createQuery(
                        "SELECT codigo FROM Mascota m WHERE m.codigo = :codigo")
                .setParameter("codigo", codigo)
                .getResultList();
        return !MascotaExistente.isEmpty();
    }
}
