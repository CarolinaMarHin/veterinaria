package com.ceiba.usuario.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.articulo.MapeoArticulo;
import com.ceiba.usuario.modelo.entidad.Articulo;
import com.ceiba.usuario.puerto.repositorio.RepositorioArticulo;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioArticuloImplementacion implements RepositorioArticulo {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="veterinaria/articulo", value="existePorId")
    private static String sqlExisteArticulo;

    @SqlStatement(namespace="veterinaria/articulo", value="crear")
    private static String sqlCrearArticulo;

    public RepositorioArticuloImplementacion(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Articulo articulo) {
        return this.customNamedParameterJdbcTemplate.crear(articulo, sqlCrearArticulo);
    }

    @Override
    public boolean existe(String codigoArticulo) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("codigoArticulo", codigoArticulo);
        return !this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlExisteArticulo, paramSource, new MapeoArticulo()).isEmpty();
    }

    /*@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void crear(Articulo articulo) {
        entityManager.createNativeQuery("INSERT INTO Articulo(codigo_articulo, nombre_articulo, precio_articulo) VALUES (:codigo_articulo, :nombre_articulo, :precio_articulo)")
                .setParameter("codigo_articulo", articulo.getCodigoArticulo())
                .setParameter("nombre_articulo", articulo.getNombreArticulo())
                .setParameter("precio_articulo", articulo.getPrecioArticulo())
                .executeUpdate();
    }

    @Override
    public boolean existe(String codigoArticulo) {
        List articulosExistente = entityManager.createQuery(
                        "SELECT codigo_articulo FROM Articulo a WHERE a.codigo_articulo = :codigoArticulo")
                .setParameter("codigoArticulo", codigoArticulo)
                .getResultList();
        return !articulosExistente.isEmpty();
    }*/
}
