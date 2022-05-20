package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MantenimientoId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.EstadoMantenimiento;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MaquinaId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Fecha;
import co.com.sofka.domain.generic.Entity;

public class Mantenimiento extends Entity<MantenimientoId> {

    protected EstadoMantenimiento estadoMantenimiento;
    protected Fecha fecha;


    public Mantenimiento(MantenimientoId mantenimientoId,
                         EstadoMantenimiento estadoMantenimiento,
                         Fecha fecha) {
        super(mantenimientoId);
        this.estadoMantenimiento = estadoMantenimiento;
        this.fecha = fecha;
    }

    public void asignarEstadoMantenimientoAMaquina(MaquinaId maquinaId,
                                                   EstadoMantenimiento estadoMantenimiento){

    }
}
