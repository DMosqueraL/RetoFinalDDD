package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Nombre;
import co.com.sofka.domain.generic.Command;

public class CambiarNombreDeLaClase extends Command {

    private final ClaseId claseId;
    private final Nombre nombreClase;

    public CambiarNombreDeLaClase(ClaseId claseId, Nombre nombreClase) {
        this.claseId = claseId;
        this.nombreClase = nombreClase;
    }

    public ClaseId getClaseId() {
        return claseId;
    }

    public Nombre getNombreClase() {
        return nombreClase;
    }
}
