package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.AdministradorId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.Promocion;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class AdministradorCreado extends DomainEvent {
    private final AdministradorId administradorId;
    private final NombreCompleto nombreAdministrador;
    private final DocumentoIdentidad documentoAdministrador;
    private final Telefono telefonoAdministrador;
    private final Email emailAdministrador;

    /*private final Cargo cargo;*/
    private final Promocion promocion;
    public AdministradorCreado(AdministradorId administradorId,
                               NombreCompleto nombreAdministrador,
                               DocumentoIdentidad documentoAdministrador,
                               Telefono telefonoAdministrador,
                               Email emailAdministrador,
                               /*Cargo cargo,*/
                               Promocion promocion) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal." +
                "AdministradorCreado");
        this.administradorId = administradorId;
        this.nombreAdministrador = nombreAdministrador;
        this.documentoAdministrador = documentoAdministrador;
        this.telefonoAdministrador = telefonoAdministrador;
        this.emailAdministrador = emailAdministrador;
        /*this.cargo = cargo;*/
        this.promocion = promocion;
    }

    /*public Cargo getCargo() {
        return cargo;
    }*/

    public AdministradorId getAdministradorId() {
        return administradorId;
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
