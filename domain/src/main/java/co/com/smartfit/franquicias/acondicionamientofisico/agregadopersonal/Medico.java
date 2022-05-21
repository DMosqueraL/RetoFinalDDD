package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.DiasALaborar;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.MedicoId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Entity;

public class Medico extends Entity<MedicoId> {

    protected NombreCompleto nombreMedico;
    protected DocumentoIdentidad documentoMedico;
    protected Telefono telefonoMedico;
    protected Email emailMedico;

    protected DiasALaborar diasALaborar;

    public Medico(MedicoId medicoId,
                  NombreCompleto nombreMedico,
                  DocumentoIdentidad documentoMedico,
                  Telefono telefonoMedico,
                  Email emailMedico,
                  DiasALaborar diasALaborar) {
        super(medicoId);
        this.nombreMedico = nombreMedico;
        this.documentoMedico = documentoMedico;
        this.telefonoMedico = telefonoMedico;
        this.emailMedico = emailMedico;
        this.diasALaborar = diasALaborar;
    }
}
