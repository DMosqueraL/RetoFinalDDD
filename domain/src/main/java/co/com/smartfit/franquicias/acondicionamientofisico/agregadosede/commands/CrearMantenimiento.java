package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.EstadoMantenimiento;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MantenimientoId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Fecha;
import co.com.sofka.domain.generic.Command;

public class CrearMantenimiento extends Command {
    private final MantenimientoId mantenimientoId;
    private final EstadoMantenimiento estadoMantenimiento;
    private final Fecha fecha;

    public CrearMantenimiento(MantenimientoId mantenimientoId, EstadoMantenimiento estadoMantenimiento, Fecha fecha) {
        this.mantenimientoId = mantenimientoId;
        this.estadoMantenimiento = estadoMantenimiento;
        this.fecha = fecha;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public EstadoMantenimiento getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
