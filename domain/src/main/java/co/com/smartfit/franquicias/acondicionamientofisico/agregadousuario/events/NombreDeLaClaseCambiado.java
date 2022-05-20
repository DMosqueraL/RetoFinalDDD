package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeLaClaseCambiado extends DomainEvent {
    private final ClaseId claseId;
    private final NombreCompleto nombreClase;
    public NombreDeLaClaseCambiado(ClaseId claseId, NombreCompleto nombreClase) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.NombreDeLaClaseCambiado");
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
