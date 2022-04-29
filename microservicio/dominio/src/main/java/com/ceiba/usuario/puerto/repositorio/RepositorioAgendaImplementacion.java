package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Agenda;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RepositorioAgendaImplementacion implements RepositorioAgenda {

    private EntityManager entityManager;

    @Override
    public void crear(Agenda agenda) {
        entityManager.createNativeQuery("INSERT INTO Agenda(codigo_agenda, fecha_agenda, estado_agenda) VALUES (:codigo_agenda, :fecha_agenda, :estado_agenda)")
                .setParameter("codigo_agenda", agenda.getCodigoAgenda())
                .setParameter("fecha_agenda", agenda.getFechaAgenda())
                .setParameter("estado_agenda", agenda.isEstadoAgenda())
                .executeUpdate();
    }

    @Override
    public boolean existe(String codigoAgenda) {
        List articulosExistente = entityManager.createQuery(
                        "SELECT codigoAgenda FROM Agenda a WHERE a.codigoAgenda = :codigoAgenda")
                .setParameter("codigoAgenda", codigoAgenda)
                .getResultList();
        return !articulosExistente.isEmpty();
    }
}
