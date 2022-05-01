package com.ceiba.usuario.adaptador.repositorio.agenda;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.agenda.MapeoAgenda;
import com.ceiba.usuario.modelo.entidad.Agenda;
import com.ceiba.usuario.puerto.repositorio.RepositorioAgenda;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

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
    public Long crear(Agenda agenda) {
        return this.customNamedParameterJdbcTemplate.crear(agenda, sqlCrearAgenda);
    }

    @Override
    public boolean existe(String codigoAgenda) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("codigoAgenda", codigoAgenda);
        return !this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlExisteAgenda, paramSource, new MapeoAgenda()).isEmpty();
    }
}
