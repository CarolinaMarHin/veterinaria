package com.ceiba.usuario.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.MapeoAgenda;
import com.ceiba.usuario.modelo.entidad.Agenda;
import com.ceiba.usuario.puerto.repositorio.RepositorioAgenda;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class RepositorioAgendaImplementacion implements RepositorioAgenda {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="veterinaria/agenda", value="existePorId")
    private static String sqlExisteAgenda;

    @SqlStatement(namespace="veterinaria/agenda", value="crear")
    private static String sqlCrearAgenda;

    public RepositorioAgendaImplementacion(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public long crear(Agenda agenda) {
        long test = this.customNamedParameterJdbcTemplate.crear(agenda, sqlCrearAgenda);
        return this.customNamedParameterJdbcTemplate.crear(agenda, sqlCrearAgenda);
    }

    @Override
    public boolean existe(String codigoAgenda) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("codigoAgenda", codigoAgenda);
        return !this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlExisteAgenda, paramSource, new MapeoAgenda()).isEmpty();
    }


    /*
    @PersistenceContext
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
    }*/
}
