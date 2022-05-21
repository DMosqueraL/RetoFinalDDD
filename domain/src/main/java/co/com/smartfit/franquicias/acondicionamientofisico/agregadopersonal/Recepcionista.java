package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.HorarioDeTrabajo;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.RecepcionistaId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Recepcionista extends Entity<RecepcionistaId> {

    protected NombreCompleto nombreRecepcionista;
    protected DocumentoIdentidad documentoRecepcionista;
    protected Telefono telefonoRecepcionista;
    protected Email emailRecepcionista;

    protected HorarioDeTrabajo horarioDeTrabajo;

    public Recepcionista(RecepcionistaId recepcionistaId,
                         NombreCompleto nombreRecepcionista,
                         DocumentoIdentidad documentoRecepcionista,
                         Telefono telefonoRecepcionista,
                         Email emailRecepcionista,
                         HorarioDeTrabajo horarioDeTrabajo) {
        super(recepcionistaId);
        this.nombreRecepcionista = nombreRecepcionista;
        this.documentoRecepcionista = documentoRecepcionista;
        this.telefonoRecepcionista = telefonoRecepcionista;
        this.emailRecepcionista = emailRecepcionista;
        this.horarioDeTrabajo = horarioDeTrabajo;
    }
}
