package com.ceiba.configuracion;

import com.ceiba.usuario.puerto.repositorio.*;
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

    @Bean
    public ServicioCrearAgenda servicioCrearAgenda(RepositorioAgenda repositorioAgenda) {
        return new ServicioCrearAgenda(repositorioAgenda);
    }

    @Bean
    public ServicioCrearServicio servicioCrearServicio(RepositorioServicio repositorioServicio) {
        return new ServicioCrearServicio(repositorioServicio);
    }

    @Bean
    public ServicioCrearCita servicioCrearCita(RepositorioCita repositorioCita) {
        return new ServicioCrearCita(repositorioCita);
    }

}
