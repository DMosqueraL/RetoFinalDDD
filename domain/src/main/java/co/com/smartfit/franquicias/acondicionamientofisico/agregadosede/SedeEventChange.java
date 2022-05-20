package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.events.*;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.EstadoMantenimiento;
import co.com.sofka.domain.generic.EventChange;

public class SedeEventChange extends EventChange {
    public SedeEventChange(Sede sede) {

        apply((SedeCreada event) -> {
            sede.nombreSede =  event.getNombreSede();
            sede.ciudad = event.getCiudad();
            sede.direccion = event.getDireccion();
            sede.telefono = event.getTelefono();
            sede.estadoMantenimiento = new EstadoMantenimiento(EstadoMantenimiento.Tipo.BUEN_ESTADO);
        });

        apply((MaquinaCreada event) -> {
            var maquinaId = event.getMaquinaId();
            var nombreMaquina = event.getNombreMaquina();
            var categoria = event.getCategoria();
            var marca = event.getMarca();
            var serial = event.getSerial();

            sede.maquina = new Maquina(maquinaId, nombreMaquina, categoria, marca, serial,
                    new EstadoMantenimiento(EstadoMantenimiento.Tipo.BUEN_ESTADO));
        });

        apply((TorniqueteCreado event) -> {
            var torniqueteId = event.getTorniqueteId();
            var lectorHuella = event.getLectorHuella();
            var serial = event.getSerial();
            var estado = new EstadoMantenimiento(EstadoMantenimiento.Tipo.BUEN_ESTADO);

            sede.torniquete = new Torniquete(torniqueteId, lectorHuella, serial, estado);
        });

        apply((MantenimientoCreado event) -> {
            var mantenimientoId = event.getMantenimientoId();
            sede.mantenimiento = new Mantenimiento(mantenimientoId,
                    event.getTipoMantenimiento(),
                    event.getFecha());
        });

        apply((MaquinaReemplazada event) -> {
            var maquinaId = event.getMaquinaId();
            var nombreMaquina = event.getNombreMaquina();
            var categoria = event.getCategoria();
            var marca = event.getMarca();
            var serial = event.getSerial();

            sede.maquina.reemplazarMaquina(maquinaId, nombreMaquina, categoria, marca, serial,
                    new EstadoMantenimiento(EstadoMantenimiento.Tipo.BUEN_ESTADO));
        });

        apply((TorniqueteReemplazado event) -> {
            var torniqueteId = event.getTorniqueteId();
            sede.torniquete.reemplazarTorniquete(torniqueteId,
                    event.getLectorHuella(),
                    event.getSerial(),
                    new EstadoMantenimiento(EstadoMantenimiento.Tipo.BUEN_ESTADO));
        });

        apply((TelefonoSedeCambiado event) -> {
            var sedeId = event.getSedeId();
            sede.cambiarTelefonoSede(sedeId, event.getTelefono());
        });
    }
}
