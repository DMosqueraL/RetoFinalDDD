package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.CuentaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Mensualidad;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Plan;
import co.com.sofka.domain.generic.Command;

public class CrearCuenta extends Command {

    private final CuentaId cuentaId;
    private final Mensualidad mensualidad;
    private final Plan plan;

    public CrearCuenta(CuentaId cuentaId, Mensualidad mensualidad, Plan plan) {
        this.cuentaId = cuentaId;
        this.mensualidad = mensualidad;
        this.plan = plan;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Mensualidad getMensualidad() {
        return mensualidad;
    }

    public Plan getPlan() {
        return plan;
    }
}
