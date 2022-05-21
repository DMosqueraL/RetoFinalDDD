package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events.AdministradorCreado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events.InstructorCreado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events.MedicoCreado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.events.RecepcionistaCreado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values.*;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.DocumentoIdentidad;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Personal extends AggregateEvent<PersonalId> {

    protected PersonalId personalId;
    protected RecepcionistaId recepcionistaId;
    protected MedicoId medicoId;
    protected InstructorId instructorId;
    protected AdministradorId administradorId;

    protected Cargo cargo;

    protected Recepcionista recepcionista;
    protected Medico medico;
    protected Instructor instructor;
    protected Administrador administrador;

    public Personal(PersonalId personalId,
                    RecepcionistaId recepcionistaId,
                    NombreCompleto nombreCompleto,
                    DocumentoIdentidad documentoRecepcionista,
                    Telefono telefonoRecepcionista,
                    Email emailRecepcionista,
                    HorarioDeTrabajo horarioDeTrabajo) {
        super(personalId);
        appendChange(new RecepcionistaCreado(recepcionistaId,
                nombreCompleto, documentoRecepcionista, telefonoRecepcionista,
                emailRecepcionista, horarioDeTrabajo)).apply();
        subscribe(new PersonalEventChange(this));
    }

    public Personal(PersonalId personalId,
                    MedicoId medicoId,
                    NombreCompleto nombreMedico,
                    DocumentoIdentidad documentoMedico,
                    Telefono telefonoMedico,
                    Email emailMedico,
                    DiasALaborar diasALaborar) {
        super(personalId);
        appendChange(new MedicoCreado(medicoId, nombreMedico,
                documentoMedico, telefonoMedico, emailMedico, diasALaborar)).apply();
        subscribe(new PersonalEventChange(this));
    }

    public Personal(PersonalId personalId,
                    InstructorId instructorId,
                    NombreCompleto nombreInstructor,
                    DocumentoIdentidad documentoInstructor,
                    Telefono telefonoInstructor,
                    Email emailInstructor,
                    Cantidad cantidadUsuarios) {
        super(personalId);
        appendChange(new InstructorCreado(instructorId, nombreInstructor, documentoInstructor,
                telefonoInstructor, emailInstructor, cantidadUsuarios)).apply();
        subscribe(new PersonalEventChange(this));
    }

    public Personal(PersonalId personalId,
                    AdministradorId administradorId,
                    NombreCompleto nombreAdministrador,
                    DocumentoIdentidad documentoAdministrador,
                    Telefono telefonoAdministrador,
                    Email emailAdministrador,
                    Promocion promocion) {
        super(personalId);
        appendChange(new AdministradorCreado(administradorId, nombreAdministrador,
                documentoAdministrador, telefonoAdministrador, emailAdministrador, promocion)).apply();
        subscribe(new PersonalEventChange(this));
    }

    private Personal(PersonalId personalId){
        super(personalId);
        subscribe(new PersonalEventChange(this));
    }

    public static Personal from(PersonalId personalId, List<DomainEvent> events){
        var personal = new Personal(personalId);
        events.forEach(personal::applyEvent);
        return personal;
    }

}
