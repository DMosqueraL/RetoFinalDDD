package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.UsuarioId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioCreado extends DomainEvent {

    private final NombreCompleto nombreCompleto;
    private final Telefono telefono;
    private final Email email;
    public UsuarioCreado(UsuarioId usuarioId, NombreCompleto nombreCompleto, Telefono telefono, Email email) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.UsuarioCreado");
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }
}
