package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class Estado implements ValueObject<Estado.Tipo> {

    private Tipo estado;

    public Estado(Tipo estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    @Override
    public Tipo value() {
        return estado;
    }

    public enum Tipo {
        ACTIVO, INACTIVO;
    }
}