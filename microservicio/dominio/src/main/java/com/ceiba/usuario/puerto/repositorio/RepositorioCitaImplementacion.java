package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Cita;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RepositorioCitaImplementacion implements RepositorioCita {

    private static final int CITA_ASIGNADA = 1;
    private static final int CITA_NO_ASIGNADA = 0;

    //@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Cita cita) {
        entityManager.createNativeQuery("SET FOREIGN_KEY_CHECKS=0")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT INTO Cita(codigo_cita, codigo_agenda, codigo_mascota, cedula_veterinario, codigo_servicio) VALUES (:codigo_cita, :codigo_agenda, :codigo_mascota, :cedula_veterinario, :codigo_servicio)")
                .setParameter("codigo_cita", cita.getCodigoCita())
                .setParameter("codigo_agenda", cita.getCodigoAgenda())
                .setParameter("codigo_mascota", cita.getCodigoMascota())
                .setParameter("cedula_veterinario", cita.getCedulaVeterinario())
                .setParameter("codigo_servicio", cita.getCodigoServicio())
                .executeUpdate();

        modificarEstadoAgenda(cita.getCodigoAgenda(), CITA_ASIGNADA);
    }

    @Override
    public boolean existe(String codigoMascota) {
        List citasExistente = entityManager.createQuery(
                        "SELECT c.codigoAgenda FROM Cita c JOIN Agenda a ON a.codigoAgenda = c.codigoAgenda WHERE c.codigoMascota = :codigoMascota AND a.estadoAgenda = 1")
                .setParameter("codigoMascota", codigoMascota)
                .getResultList();
        if (!citasExistente.isEmpty()) {
            modificarEstadoAgenda(citasExistente.get(0).toString(), CITA_NO_ASIGNADA);
        }
        return !citasExistente.isEmpty();
    }

    public void modificarEstadoAgenda(String codigoAgenda, int estadoCita) {
        entityManager.createNativeQuery("UPDATE Agenda SET estado_agenda = :estadoCita WHERE codigo_agenda = :codigoAgenda")
                .setParameter("estadoCita", estadoCita)
                .setParameter("codigoAgenda", codigoAgenda)
                .executeUpdate();
    }
}
