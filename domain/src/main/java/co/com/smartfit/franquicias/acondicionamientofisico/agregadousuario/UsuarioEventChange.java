package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.*;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Estado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.EvaluacionFisicaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Plan;
import co.com.sofka.domain.generic.EventChange;

public class UsuarioEventChange extends EventChange {
    public UsuarioEventChange(Usuario usuario) {

        apply((UsuarioCreado event) -> {
            usuario.nombre = event.getNombreCompleto();
            usuario.telefono = event.getTelefono();
            usuario.email = event.getEmail();
            usuario.estado = new Estado(Estado.Tipo.ACTIVO);
        });

        apply((CuentaCreada event) -> {
//            var CuentaId = event.getCuentaId();
            var cuenta = new Cuenta(event.getCuentaId(), event.getMensualidad(),
                    new Plan(Plan.Tipo.PLAN_BÁSICO));
        });

        apply((ClaseCreada event) -> {
            var claseId = new ClaseId();
            var clase = new Clase(claseId, event.getNombreClase(),
                    event.getRutina(),
                    event.getDuracion());
        });

        apply((EvaluacionFisicaCreada event) -> {
            var evFisId = new EvaluacionFisicaId();
            usuario.evaluacionFisica = new EvaluacionFisica(evFisId, event.getPeso(), event.getAltura());

        });

        apply((PlanCambiadoAGold event) -> {
            var cuentaId = event.getCuentaId();
            var plan = new Plan(Plan.Tipo.PLAN_GOLD);
            usuario.cuenta.cambiarAPlanGold(cuentaId, plan);
        });

        apply((PlanCambiadoAPremiun event) -> {
            var cuentaId = event.getCuentaId();
            var plan = new Plan(Plan.Tipo.PLAN_GOLD);
            usuario.cuenta.cambiarAPlanPremiun(cuentaId, plan);
        });

        apply((EstadoUsuarioAsignado event) -> {
            var cuentaId = event.getUsuarioId();
            var estado = new Estado(Estado.Tipo.INACTIVO);
            usuario.asignarEstadoUsuario(cuentaId, estado);
        });

        apply((CalculadoIMC event) -> {
            var evaluacionFisicaId = event.getEvaluacionFisicaId();
            var peso = event.getPeso();
            var altura = event.getAltura();
            usuario.evaluacionFisica.calcularIMC(peso, altura);
        });

        apply((NombreDeLaClaseCambiado event) -> {
            usuario.clase.cambiarNombreDeLaClase(event.getClaseId(), event.getNombreClase());
        });

    }
}
