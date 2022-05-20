package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.sofka.domain.generic.Command;

public class CambiarNombreDeLaClase extends Command {

    private final ClaseId claseId;
    private final NombreCompleto nombreClase;

    public CambiarNombreDeLaClase(ClaseId claseId, NombreCompleto nombreClase) {
        this.claseId = claseId;
        this.nombreClase = nombreClase;
    }

    public ClaseId getClaseId() {
        return claseId;
    }

    public NombreCompleto getNombreClase() {
        return nombreClase;
    }
}
