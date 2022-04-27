package com.ceiba.usuario.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

public class MapeoMascota implements RowMapper<DtoMascota>, MapperResult {

    @Override
    public DtoMascota mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        int idMascota = resultSet.getInt("id_mascota");
        String codigo = resultSet.getString("codigo");
        String nombre = resultSet.getString("nombre");
        String raza = resultSet.getString("raza");
        Date fechaNacimiento = resultSet.getDate("fecha_nacimiento");
        int peso = resultSet.getInt("peso");

        return new DtoMascota(idMascota, codigo, nombre, raza, fechaNacimiento, peso);
    }

}
