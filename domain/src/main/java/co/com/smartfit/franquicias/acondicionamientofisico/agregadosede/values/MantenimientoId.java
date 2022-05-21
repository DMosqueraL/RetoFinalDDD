package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values;

import co.com.sofka.domain.generic.Identity;

public class MantenimientoId extends Identity {
    public MantenimientoId(String id) {
        super(id);
    }

    public MantenimientoId() {

    }

    public static MantenimientoId of(String id) {
        return new MantenimientoId(id);
    }
}
