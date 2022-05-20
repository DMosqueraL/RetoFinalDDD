package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

public class PlanCambiadoAGold extends DomainEvent {
    private final CuentaId cuentaId;

    public PlanCambiadoAGold(CuentaId cuentaId) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.PlanCambiadoAGold");
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

}
