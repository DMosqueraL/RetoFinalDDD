package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.*;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.*;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected EvaluacionFisicaId evaluacionFisicaId;
    protected ClaseId claseId;
    protected CuentaId cuentaId;
    protected NombreCompleto nombreCompleto;
    protected Telefono telefono;
    protected Email email;
    protected Estado estado;
    protected EvaluacionFisica evaluacionFisica;
    protected Clase clase;
    protected Cuenta cuenta;

    public Usuario(UsuarioId usuarioId,
                   NombreCompleto nombreCompleto,
                   Telefono telefono,
                   Email email,
                   Estado estado,
                   EvaluacionFisica evaluacionFisica,
                   Clase clase,
                   Cuenta cuenta){
        super(usuarioId);
        appendChange(new UsuarioCreado(usuarioId, nombreCompleto, telefono, email)).apply();
        subscribe(new UsuarioEventChange(this));
    }

    public Usuario(UsuarioId usuarioId, NombreCompleto nombreCompleto, Telefono telefono, Email email){
        super(usuarioId);
        appendChange(new UsuarioCreado(usuarioId, nombreCompleto, telefono, email)).apply();
        subscribe(new UsuarioEventChange(this));
    }

    private Usuario(UsuarioId usuarioId){
        super(usuarioId);
        subscribe(new UsuarioEventChange(this));
    }

    public static Usuario from(UsuarioId usuarioId, List<DomainEvent> events){
        var usuario = new Usuario(usuarioId);
        events.forEach(usuario::applyEvent);
        return usuario;
    }

    public void crearCuenta(Mensualidad mensualidad, Plan plan){
        var cuentaId = new CuentaId();
        appendChange(new CuentaCreada(cuentaId, mensualidad, plan)).apply();
    }

    public void crearClase(NombreCompleto nombreClase,
                           Rutina rutina,
                           Duracion duracion){
        var claseId = new ClaseId();
        appendChange(new ClaseCreada(claseId, nombreClase, rutina, duracion)).apply();
    }

    public void crearEvaluacionFisica(Peso peso, Altura altura, IMC imc){
        var evaluacionFisicaId = new EvaluacionFisicaId();
        appendChange(new EvaluacionFisicaCreada(evaluacionFisicaId, peso, altura, imc)).apply();
    }

    public void asignarEstadoUsuario(UsuarioId usuarioId, Estado estado){
        this.estado = estado;
        appendChange(new EstadoUsuarioAsignado(usuarioId, estado)).apply();
    }

    public void cambiarAPlanGold(CuentaId cuentaId){
        appendChange(new PlanCambiadoAGold(cuentaId)).apply();
    }

    public void cambiarAPlanPremiun(CuentaId cuentaId){
        appendChange(new PlanCambiadoAPremiun(cuentaId)).apply();
    }

    public void CalcularIMC(EvaluacionFisicaId evaluacionFisicaId, Peso peso, Altura altura){
        appendChange(new CalculadoIMC(evaluacionFisicaId, peso, altura)).apply();
    }

    public void cambiarNombreDeLaClase(ClaseId claseId, NombreCompleto nombreClase){
        appendChange(new NombreDeLaClaseCambiado(claseId, nombreClase)).apply();
    }
}
