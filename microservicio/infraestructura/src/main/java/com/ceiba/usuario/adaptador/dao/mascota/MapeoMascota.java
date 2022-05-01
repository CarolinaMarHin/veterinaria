package com.ceiba.usuario.adaptador.dao.mascota;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoMascota;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MapeoMascota implements RowMapper<DtoMascota>, MapperResult {

    @Override
    public DtoMascota mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        String codigoMascota = resultSet.getString("codigo_mascota");
        String nombreMascota = resultSet.getString("nombre_mascota");
        String raza = resultSet.getString("raza");
        Date fechaNacimientoMascota = resultSet.getDate("fecha_nacimiento_mascota");
        int peso = resultSet.getInt("peso");

        return new DtoMascota(codigoMascota, nombreMascota, raza, fechaNacimientoMascota, peso);
    }

}
