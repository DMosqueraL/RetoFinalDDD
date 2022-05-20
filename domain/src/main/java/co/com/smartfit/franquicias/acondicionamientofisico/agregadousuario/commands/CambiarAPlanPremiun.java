package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.CuentaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Plan;
import co.com.sofka.domain.generic.Command;

public class CambiarAPlanPremiun extends Command {

    private final CuentaId cuentaId;
    private final Plan plan;

    public CambiarAPlanPremiun(CuentaId cuentaId, Plan plan) {
        this.cuentaId = cuentaId;
        this.plan = plan;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
