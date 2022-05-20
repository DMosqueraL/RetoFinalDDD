package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Categoria;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.MaquinaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.Marca;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Serial;
import co.com.sofka.domain.generic.Command;

public class CrearMaquina extends Command {
    private final MaquinaId maquinaId;
    private final NombreCompleto nombreMaquina;
    private final Categoria categoria;
    private final Marca marca;
    private final Serial serial;

    public CrearMaquina(MaquinaId maquinaId, NombreCompleto nombreMaquina,
                        Categoria categoria, Marca marca, Serial serial) {
        this.maquinaId = maquinaId;
        this.nombreMaquina = nombreMaquina;
        this.categoria = categoria;
        this.marca = marca;
        this.serial = serial;
    }

    public MaquinaId getMaquinaId() {
        return maquinaId;
    }

    public NombreCompleto getNombreMaquina() {
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
}
