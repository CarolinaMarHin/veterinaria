package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Veterinario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RepositorioVeterinarioImplementacion implements RepositorioVeterinario {

    //@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Veterinario veterinario) {
        entityManager.createNativeQuery("INSERT INTO Veterinario(nombre_veterinario, cedula_veterinario, fecha_nacimiento_veterinario) VALUES (:nombreVeterinario, :cedulaVeterinario, :fechaNacimientoVeterinario)")
                .setParameter("nombreVeterinario", veterinario.getNombreVeterinario())
                .setParameter("cedulaVeterinario", veterinario.getCedulaVeterinario())
                .setParameter("fechaNacimientoVeterinario", veterinario.getFechaNacimientoVeterinario())
                .executeUpdate();
    }

    @Override
    public boolean existe(String cedulaVeterinario) {
        List veterinarioExistente = entityManager.createQuery(
                        "SELECT cedulaVeterinario FROM Veterinario v WHERE v.cedulaVeterinario = :cedulaVeterinario")
                .setParameter("cedulaVeterinario", cedulaVeterinario)
                .getResultList();
        return !veterinarioExistente.isEmpty();
    }
}
