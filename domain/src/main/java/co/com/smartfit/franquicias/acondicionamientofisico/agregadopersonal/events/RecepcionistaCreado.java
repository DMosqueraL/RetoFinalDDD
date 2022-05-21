package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.HorarioDeTrabajo;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.RecepcionistaId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class RecepcionistaCreado extends DomainEvent {

    private final RecepcionistaId recepcionistaId;
    private final NombreCompleto nombreCompleto;
    private final DocumentoIdentidad documentoRecepcionista;
    private final Telefono telefonoRecepcionista;
    private final Email emailRecepcionista;
//    private final Cargo cargo;
    private final HorarioDeTrabajo horarioDeTrabajo;
    public RecepcionistaCreado(RecepcionistaId recepcionistaId,
                               NombreCompleto nombreCompleto,
                               DocumentoIdentidad documentoRecepcionista,
                               Telefono telefonoRecepcionista,
                               Email emailRecepcionista,
//                               Cargo cargo,
                               HorarioDeTrabajo horarioDeTrabajo) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.RecepcionistaCreado");
        this.recepcionistaId = recepcionistaId;
        this.nombreCompleto = nombreCompleto;
        this.documentoRecepcionista = documentoRecepcionista;
        this.telefonoRecepcionista = telefonoRecepcionista;
        this.emailRecepcionista = emailRecepcionista;
//        this.cargo = cargo;
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

//    public Cargo getCargo() {
//        return cargo;
//    }

    public RecepcionistaId getRecepcionistaId() {
        return recepcionistaId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public DocumentoIdentidad getDocumentoRecepcionista() {
        return documentoRecepcionista;
    }

    public Telefono getTelefonoRecepcionista() {
        return telefonoRecepcionista;
    }

    public Email getEmailRecepcionista() {
        return emailRecepcionista;
    }

    public HorarioDeTrabajo getHorarioDeTrabajo() {
        return horarioDeTrabajo;
    }
}
