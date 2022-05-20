package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Ciudad;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Direccion;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.SedeId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class SedeCreada extends DomainEvent {
    private final NombreCompleto nombreSede;
    private final Ciudad ciudad;
    private final Direccion direccion;
    private final Telefono telefono;
    public SedeCreada(SedeId sedeId, NombreCompleto nombreSede, Ciudad ciudad, Direccion direccion, Telefono telefono) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.SedeCreada");
        this.nombreSede = nombreSede;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public NombreCompleto getNombreSede() {
        return nombreSede;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
