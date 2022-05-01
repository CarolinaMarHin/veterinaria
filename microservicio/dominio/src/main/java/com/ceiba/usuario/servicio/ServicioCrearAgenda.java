package com.ceiba.usuario.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Agenda;
import com.ceiba.usuario.puerto.repositorio.RepositorioAgenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;

@Service
public class ServicioCrearAgenda {

    private static final String LA_AGENDA_YA_EXISTE_EN_EL_SISTEMA = "La Agenda ya existe en el sistema";
    private static final String AGENDA_FIN_DE_SEMANA = "Los dias de atencion es de lunes a viernes, no se puede crear la agenda";

    private final RepositorioAgenda repositorioAgenda;

    @Autowired
    public ServicioCrearAgenda(RepositorioAgenda repositorioAgenda) {
        this.repositorioAgenda = repositorioAgenda;
    }

    public long ejecutar(Agenda agenda) {
        validarExistenciaPrevia(agenda);
        return this.repositorioAgenda.crear(agenda);
    }

    private void validarExistenciaPrevia(Agenda agenda) {
        boolean existe = this.repositorioAgenda.existe(agenda.getCodigoAgenda());
        boolean esFinDeSemana = this.isWeekends(agenda.getFechaAgenda());
        if (existe) {
            throw new ExcepcionDuplicidad(LA_AGENDA_YA_EXISTE_EN_EL_SISTEMA);
        } else if (esFinDeSemana){
            throw new ExcepcionDuplicidad(AGENDA_FIN_DE_SEMANA);
        }
    }

    public boolean isWeekends(Date fechaAgenda) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaAgenda);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY;
    }
}

