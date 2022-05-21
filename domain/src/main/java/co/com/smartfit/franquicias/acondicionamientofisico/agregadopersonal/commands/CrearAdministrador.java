package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.AdministradorId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.PersonalId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.Promocion;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearAdministrador extends Command {
    private final PersonalId personalId;
    private final AdministradorId administradorId;
    private final NombreCompleto nombreAdministrador;
    private final DocumentoIdentidad documentoAdministrador;
    private final Telefono telefonoAdministrador;
    private final Email emailAdministrador;
    private final Promocion promocion;

    public CrearAdministrador(PersonalId personalId, AdministradorId administradorId,
                              NombreCompleto nombreAdministrador,
                              DocumentoIdentidad documentoAdministrador,
                              Telefono telefonoAdministrador,
                              Email emailAdministrador,
                              Promocion promocion) {
        this.personalId = personalId;
        this.administradorId = administradorId;
        this.nombreAdministrador = nombreAdministrador;
        this.documentoAdministrador = documentoAdministrador;
        this.telefonoAdministrador = telefonoAdministrador;
        this.emailAdministrador = emailAdministrador;
        this.promocion = promocion;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public NombreCompleto getNombreAdministrador() {
        return nombreAdministrador;
    }

    public DocumentoIdentidad getDocumentoAdministrador() {
        return documentoAdministrador;
    }

    public Telefono getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public Email getEmailAdministrador() {
        return emailAdministrador;
    }

    public Promocion getPromocion() {
        return promocion;
    }
}
