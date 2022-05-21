package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Categoria;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.EstadoMantenimiento;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MaquinaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Marca;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Fecha;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Nombre;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Serial;
import co.com.sofka.domain.generic.Command;

public class AsignarMaquinaAMantenimiento extends Command {
    private final MaquinaId maquinaId;
    private final Nombre nombreMaquina;
    private final Categoria categoria;
    private final Marca marca;
    private final Serial serial;
    private final EstadoMantenimiento estadoMantenimiento;
    private final Fecha fecha;

    public AsignarMaquinaAMantenimiento(MaquinaId maquinaId,
                                        Nombre nombreMaquina,
                                        Categoria categoria,
                                        Marca marca, Serial serial,
                                        EstadoMantenimiento estadoMantenimiento,
                                        Fecha fecha) {
        this.maquinaId = maquinaId;
        this.nombreMaquina = nombreMaquina;
        this.categoria = categoria;
        this.marca = marca;
        this.serial = serial;
        this.estadoMantenimiento = estadoMantenimiento;
        this.fecha = fecha;
    }

    public MaquinaId getMaquinaId() {
        return maquinaId;
    }

    public Nombre getNombreMaquina() {
        return nombreMaquina;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public Serial getSerial() {
        return serial;
    }

    public EstadoMantenimiento getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
