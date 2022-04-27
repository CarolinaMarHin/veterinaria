package com.ceiba.usuario.puerto.repositorio;

import com.ceiba.usuario.modelo.entidad.Veterinario;

public interface RepositorioVeterinario {
    void crear(Veterinario veterinario);
    boolean existe(String cedula);
}
