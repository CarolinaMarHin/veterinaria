package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Veterinario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioVeterinarioImplementacion implements RepositorioVeterinario {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Veterinario veterinario) {
        entityManager.createNativeQuery("INSERT INTO Veterinario(nombre, cedula, fecha_nacimiento) VALUES (:nombre, :cedula, :fechaNacimiento)")
                .setParameter("nombre", veterinario.getNombre())
                .setParameter("cedula", veterinario.getCedula())
                .setParameter("fechaNacimiento", veterinario.getFechaNacimiento())
                .executeUpdate();
    }

    @Override
    public boolean existe(String cedula) {
        List veterinarioExistente = entityManager.createQuery(
                        "SELECT cedula FROM Veterinario v WHERE v.cedula = :cedula")
                .setParameter("cedula", cedula)
                .getResultList();
        return !veterinarioExistente.isEmpty();
    }
}
