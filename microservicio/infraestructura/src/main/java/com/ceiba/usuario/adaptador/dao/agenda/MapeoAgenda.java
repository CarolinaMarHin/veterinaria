package com.ceiba.usuario.adaptador.dao.agenda;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoAgenda;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoAgenda implements RowMapper<DtoAgenda>, MapperResult {

    @Override
    public DtoAgenda mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        String codigoAgenda = resultSet.getString("codigo_agenda");
        Date fechaAgenda = resultSet.getDate("fecha_agenda");
        boolean estadoAgenda = resultSet.getBoolean("estado_agenda");

        return new DtoAgenda(codigoAgenda, fechaAgenda, estadoAgenda);
    }

}
