package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.events.*;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.*;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Fecha;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Serial;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Sede extends AggregateEvent<SedeId> {
    protected MaquinaId maquinaId;
    protected SedeId sedeId;
    protected NombreCompleto nombreSede;
    protected Ciudad ciudad;
    protected Direccion direccion;
    protected Telefono telefono;
    protected Maquina maquina;
    protected Torniquete torniquete;
    protected Mantenimiento mantenimiento;
    protected EstadoMantenimiento estadoMantenimiento;

    public Sede(SedeId sedeId, NombreCompleto nombreSede,
                Ciudad ciudad, Direccion direccion,
                Telefono telefono,
                EstadoMantenimiento estadoMantenimiento,
                Maquina maquina, Torniquete torniquete, Mantenimiento mantenimiento) {
        super(sedeId);
        appendChange(new SedeCreada(sedeId, nombreSede, ciudad, direccion, telefono)).apply();
        subscribe(new SedeEventChange(this));
    }

    private Sede(SedeId sedeId){
        super(sedeId);
        subscribe(new SedeEventChange(this));
    }

    public static Sede from(SedeId sedeId, List<DomainEvent> events){
        var sede = new Sede(sedeId);
        events.forEach(sede::applyEvent);
        return sede;
    }

    public void crearTorniquete(LectorHuella lectorHuella, Serial serial){
        var torniqueteId = new TorniqueteId();
        appendChange(new TorniqueteCreado(torniqueteId, lectorHuella, serial)).apply();
    }

    public void crearMaquina(NombreCompleto nombreMaquina,
                             Categoria categoria, Marca marca, Serial serial){
        var maquinaId = new MaquinaId();
        appendChange(new MaquinaCreada(maquinaId, nombreMaquina, categoria, marca, serial)).apply();
    }

    public void crearMantenimiento(EstadoMantenimiento estadoMantenimiento,
                                   Fecha fecha){
        var mantenimientoId = new MantenimientoId();
        appendChange(new MantenimientoCreado(mantenimientoId, estadoMantenimiento, fecha)).apply();
    }

    public void cambiarTelefonoSede(SedeId sedeId, Telefono telefono){
        this.sedeId = SedeId.of(sedeId.value());
        this.telefono = Telefono.of(telefono.value());
        appendChange(new TelefonoSedeCambiado(sedeId, telefono)).apply();
    }

    public void reemplazarMaquina(NombreCompleto nombreMaquina,
                                  Categoria categoria, Marca marca, Serial serial){
        var maquinaId = new MaquinaId();
        appendChange(new MaquinaReemplazada(maquinaId, nombreMaquina, categoria, marca, serial)).apply();
    }

    public void reemplazarTorniquete(LectorHuella lectorHuella, Serial serial){
        var torniqueteId = new TorniqueteId();
        appendChange(new TorniqueteReemplazado (torniqueteId, lectorHuella, serial)).apply();
    }
}
