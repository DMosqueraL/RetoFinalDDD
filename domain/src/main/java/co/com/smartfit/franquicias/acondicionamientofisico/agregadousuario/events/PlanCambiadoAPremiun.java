package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

public class PlanCambiadoAPremiun extends DomainEvent {

    private final CuentaId cuentaId;
    public PlanCambiadoAPremiun(CuentaId cuentaId) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.PlanCambiadoAPremiun");
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
