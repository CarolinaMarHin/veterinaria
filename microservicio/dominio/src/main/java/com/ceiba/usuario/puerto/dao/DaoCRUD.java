package com.ceiba.usuario.puerto.dao;


public interface DaoCRUD<T> {
    void registrar(T t);
    void actualizar(T t);
}
