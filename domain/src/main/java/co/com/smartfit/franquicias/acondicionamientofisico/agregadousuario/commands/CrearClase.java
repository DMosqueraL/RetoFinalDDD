package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Duracion;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Rutina;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.sofka.domain.generic.Command;

public class CrearClase extends Command {
    private final ClaseId claseId;
    private final NombreCompleto nombreClase;
    private final Rutina rutina;
    private final Duracion duracion;

    public CrearClase(ClaseId claseId, NombreCompleto nombreClase, Rutina rutina, Duracion duracion) {
        this.claseId = claseId;
        this.nombreClase = nombreClase;
        this.rutina = rutina;
        this.duracion = duracion;
    }

    public ClaseId getClaseId() {
        return claseId;
    }

    public NombreCompleto getNombreClase() {
        return nombreClase;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
