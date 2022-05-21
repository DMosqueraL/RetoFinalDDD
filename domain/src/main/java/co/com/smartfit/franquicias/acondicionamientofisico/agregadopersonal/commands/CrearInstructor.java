package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.Cantidad;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.InstructorId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearInstructor extends Command {
    private final InstructorId instructorId;
    private final NombreCompleto nombreInstructor;
    private final DocumentoIdentidad documentoInstructor;
    private final Telefono telefonoInstructor;
    private final Email emailInstructor;
    private final Cantidad cantidadUsuarios;

    public CrearInstructor(InstructorId instructorId, NombreCompleto nombreInstructor,
                           DocumentoIdentidad documentoInstructor,
                           Telefono telefonoInstructor, Email emailInstructor,
                           Cantidad cantidadUsuarios) {
        this.instructorId = instructorId;
        this.nombreInstructor = nombreInstructor;
        this.documentoInstructor = documentoInstructor;
        this.telefonoInstructor = telefonoInstructor;
        this.emailInstructor = emailInstructor;
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public NombreCompleto getNombreInstructor() {
        return nombreInstructor;
    }

    public DocumentoIdentidad getDocumentoInstructor() {
        return documentoInstructor;
    }

    public Telefono getTelefonoInstructor() {
        return telefonoInstructor;
    }

    public Email getEmailInstructor() {
        return emailInstructor;
    }

    public Cantidad getCantidadUsuarios() {
        return cantidadUsuarios;
    }
}
