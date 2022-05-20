package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.*;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Estado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Plan;
import co.com.sofka.domain.generic.EventChange;

public class UsuarioEventChange extends EventChange {
    public UsuarioEventChange(Usuario usuario) {

        apply((UsuarioCreado event) -> {
            usuario.nombreCompleto = event.getNombreCompleto();
            usuario.telefono = event.getTelefono();
            usuario.email = event.getEmail();
            usuario.estado = new Estado(Estado.Tipo.ACTIVO);
        });

        apply((CuentaCreada event) -> {
            var CuentaId = event.getCuentaId();
            var cuenta = new Cuenta(usuario.cuentaId, event.getMensualidad(),
                    new Plan(Plan.Tipo.PLAN_BÁSICO));
        });

        apply((ClaseCreada event) -> {
            usuario.clase.nombreClase = event.getNombreClase();
            usuario.clase.rutina = event.getRutina();
            usuario.clase.duracion = event.getDuracion();
        });

        apply((EvaluacionFisicaCreada event) -> {
            usuario.evaluacionFisica.peso = event.getPeso();
            usuario.evaluacionFisica.altura = event.getAltura();
            usuario.evaluacionFisica.imc = event.getImc();
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
            var claseId = event.getClaseId();
            var nombreClase = event.getNombreClase();
            usuario.clase.cambiarNombreDeLaClase(claseId, nombreClase);
        });

    }
}
