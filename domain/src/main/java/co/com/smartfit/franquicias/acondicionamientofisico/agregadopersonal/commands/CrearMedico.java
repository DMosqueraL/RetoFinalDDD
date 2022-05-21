package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.DiasALaborar;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.MedicoId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.PersonalId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearMedico extends Command {
    private final PersonalId personalId;

    private final MedicoId medicoId;
    private final NombreCompleto nombreMedico;
    private final DocumentoIdentidad documentoMedico;
    private final Telefono telefonoMedico;
    private final Email emailMedico;
    private final DiasALaborar diasALaborar;

    public CrearMedico(PersonalId personalId, MedicoId medicoId, NombreCompleto nombreMedico,
                       DocumentoIdentidad documentoMedico,
                       Telefono telefonoMedico, Email emailMedico,
                       DiasALaborar diasALaborar) {
        this.personalId = personalId;
        this.medicoId = medicoId;
        this.nombreMedico = nombreMedico;
        this.documentoMedico = documentoMedico;
        this.telefonoMedico = telefonoMedico;
        this.emailMedico = emailMedico;
        this.diasALaborar = diasALaborar;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public NombreCompleto getNombreMedico() {
        return nombreMedico;
    }

    public DocumentoIdentidad getDocumentoMedico() {
        return documentoMedico;
    }

    public Telefono getTelefonoMedico() {
        return telefonoMedico;
    }

    public Email getEmailMedico() {
        return emailMedico;
    }

    public DiasALaborar getDiasALaborar() {
        return diasALaborar;
    }
}
