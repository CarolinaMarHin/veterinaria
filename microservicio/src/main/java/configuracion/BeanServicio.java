package com.ceiba.configuracion;

import com.ceiba.usuario.puerto.repositorio.RepositorioFactura;
import com.ceiba.usuario.puerto.repositorio.RepositorioMascota;
import com.ceiba.usuario.puerto.repositorio.RepositorioArticulo;
import com.ceiba.usuario.puerto.repositorio.RepositorioVeterinario;
import com.ceiba.usuario.servicio.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearArticulo servicioCrearArticulo(RepositorioArticulo repositorioArticulo) {
        return new ServicioCrearArticulo(repositorioArticulo);
    }

    @Bean
    public ServicioCrearVeterinario servicioCrearVeterinario(RepositorioVeterinario repositorioVeterinario) {
        return new ServicioCrearVeterinario(repositorioVeterinario);
    }

    @Bean
    public ServicioCrearMascota servicioCrearMascota(RepositorioMascota repositorioMascota) {
        return new ServicioCrearMascota(repositorioMascota);
    }

    @Bean
    public ServicioCrearFactura servicioCrearFactura(RepositorioFactura repositorioFactura) {
        return new ServicioCrearFactura(repositorioFactura);
    }
    /*@Bean
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
    }*/
	

}
