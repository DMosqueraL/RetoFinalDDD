package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.LectorHuella;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values.TorniqueteId;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Serial;
import co.com.sofka.domain.generic.Command;

public class ReemplazarTorniquete extends Command {

    private final TorniqueteId torniqueteId;
    private final LectorHuella lectorHuella;
    private final Serial serial;

    public ReemplazarTorniquete(TorniqueteId torniqueteId, LectorHuella lectorHuella, Serial serial) {
        this.torniqueteId = torniqueteId;
        this.lectorHuella = lectorHuella;
        this.serial = serial;
    }

    public TorniqueteId getTorniqueteId() {
        return torniqueteId;
    }

    public LectorHuella getLectorHuella() {
        return lectorHuella;
    }

    public Serial getSerial() {
        return serial;
    }
}
