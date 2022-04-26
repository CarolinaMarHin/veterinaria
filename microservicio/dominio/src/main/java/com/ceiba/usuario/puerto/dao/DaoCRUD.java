package com.ceiba.usuario.puerto.dao;


import java.util.List;

public interface DaoCRUD<T> {
    void registrar(T t);
    void actualizar(T t);
}
