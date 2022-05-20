package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Estado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.UsuarioId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearUsuario extends Command {
    private final UsuarioId usuarioId;
    private final NombreCompleto nombreUsuario;
    private final Telefono telefono;
    private final Email email;
    private final Estado estado;

    public CrearUsuario(UsuarioId usuarioId,
                        NombreCompleto nombreUsuario,
                        Telefono telefono,
                        Email email,
                        Estado estado) {
        this.usuarioId = usuarioId;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public NombreCompleto getNombreUsuario() {
        return nombreUsuario;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }

    public Estado getEstado() {
        return estado;
    }
}