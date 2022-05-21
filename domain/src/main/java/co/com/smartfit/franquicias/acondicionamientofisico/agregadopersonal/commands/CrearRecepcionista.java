package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.HorarioDeTrabajo;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.RecepcionistaId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearRecepcionista extends Command {

    private final RecepcionistaId recepcionistaId;
    private final NombreCompleto nombreCompleto;
    private final DocumentoIdentidad documentoRecepcionista;
    private final Telefono telefonoRecepcionista;
    private final Email emailRecepcionista;
    private final HorarioDeTrabajo horarioDeTrabajo;

    public CrearRecepcionista(RecepcionistaId recepcionistaId,
                              NombreCompleto nombreCompleto,
                              DocumentoIdentidad documentoRecepcionista,
                              Telefono telefonoRecepcionista,
                              Email emailRecepcionista,
                              HorarioDeTrabajo horarioDeTrabajo) {
        this.recepcionistaId = recepcionistaId;
        this.nombreCompleto = nombreCompleto;
        this.documentoRecepcionista = documentoRecepcionista;
        this.telefonoRecepcionista = telefonoRecepcionista;
        this.emailRecepcionista = emailRecepcionista;
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

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
