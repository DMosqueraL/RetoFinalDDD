package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MantenimientoId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.EstadoMantenimiento;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Fecha;
import co.com.sofka.domain.generic.DomainEvent;

public class MantenimientoCreado extends DomainEvent {
    private final MantenimientoId mantenimientoId;
    private final EstadoMantenimiento estadoMantenimiento;
    private final Fecha fecha;
    public MantenimientoCreado(MantenimientoId mantenimientoId, EstadoMantenimiento estadoMantenimiento, Fecha fecha) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.MantenimientoCreado");
        this.mantenimientoId = mantenimientoId;
        this.estadoMantenimiento = estadoMantenimiento;
        this.fecha = fecha;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public EstadoMantenimiento getTipoMantenimiento() {
        return estadoMantenimiento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
