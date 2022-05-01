package com.ceiba.usuario.adaptador.repositorio.mascota;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.mascota.MapeoMascota;
import com.ceiba.usuario.modelo.entidad.Mascota;
import com.ceiba.usuario.puerto.repositorio.RepositorioMascota;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMascotaImplementacion implements RepositorioMascota {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="veterinaria/mascota", value="existePorId")
    private static String sqlExisteMascota;

    @SqlStatement(namespace="veterinaria/mascota", value="crear")
    private static String sqlCrearMascota;

    public RepositorioMascotaImplementacion(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Mascota mascota) {
        return this.customNamedParameterJdbcTemplate.crear(mascota, sqlCrearMascota);
    }

    @Override
    public boolean existe(String codigoMascota) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("codigoMascota", codigoMascota);
        return !this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlExisteMascota, paramSource, new MapeoMascota()).isEmpty();
    }
}
