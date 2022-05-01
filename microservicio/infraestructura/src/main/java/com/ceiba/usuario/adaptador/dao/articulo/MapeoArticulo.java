package com.ceiba.usuario.adaptador.dao.articulo;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.usuario.modelo.dto.DtoArticulo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoArticulo implements RowMapper<DtoArticulo>, MapperResult {

    @Override
    public DtoArticulo mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        String codigoArticulo = resultSet.getString("codigo_articulo");
        String nombreArticulo = resultSet.getString("nombre_articulo");
        String precioArticulo = resultSet.getString("precio_articulo");

        return new DtoArticulo(codigoArticulo, nombreArticulo, precioArticulo);
    }

}
