package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Servicio;
import com.ceiba.usuario.puerto.repositorio.RepositorioServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearServicio {

    private static final String EL_SERVICIO_YA_EXISTE_EN_EL_SISTEMA = "El Servicio ya existe en el sistema";

    private RepositorioServicio repositorioServicio;

    public ServicioCrearServicio(RepositorioServicio repositorioServicio) {
        this.repositorioServicio = repositorioServicio;
    }

    public void ejecutar(List<Servicio> servicios, String numeroFactura) {
        validarExistenciaPrevia(servicios);
        this.repositorioServicio.crear(servicios, numeroFactura);
    }

    private void validarExistenciaPrevia(List<Servicio> servicios) {
        boolean existe = this.repositorioServicio.existe(servicios);
        if (existe) {
            throw new ExcepcionDuplicidad(EL_SERVICIO_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}

