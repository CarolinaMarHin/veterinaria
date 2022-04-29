package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RepositorioUsuarioImplementacion implements RepositorioUsuario {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long crear(Usuario usuario) {
        return null;
    }

    @Override
    public void actualizar(Usuario usuario) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public boolean existe(String nombre) {
        return false;
    }

    @Override
    public boolean existePorId(Long id) {
        return false;
    }
}
