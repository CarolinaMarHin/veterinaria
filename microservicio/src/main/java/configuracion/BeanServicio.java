package com.ceiba.configuracion;

import com.ceiba.usuario.puerto.repositorio.RepositorioServicio;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioVeterinario;
import com.ceiba.usuario.servicio.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearServicio servicioCrearServicio(RepositorioServicio repositorioServicio) {
        return new ServicioCrearServicio(repositorioServicio);
    }

    @Bean
    public ServicioCrearVeterinario servicioCrearVeterinario(RepositorioVeterinario repositorioVeterinario) {
        return new ServicioCrearVeterinario(repositorioVeterinario);
    }

    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioCrearUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario) {
        return new ServicioActualizarUsuario(repositorioUsuario);
    }
	

}
