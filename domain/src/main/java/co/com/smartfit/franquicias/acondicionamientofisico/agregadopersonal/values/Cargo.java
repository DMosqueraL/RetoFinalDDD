package co.com.smartfit.franquicias.acondicionamientofisico.agregadopersonal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cargo implements ValueObject<Cargo.Tipo> {

    private Cargo.Tipo cargo;

    public Cargo(Cargo.Tipo tipoMantenimiento) {
        this.cargo = Objects.requireNonNull(tipoMantenimiento);

        if (String.valueOf(this.cargo).isBlank()) {
            throw new IllegalArgumentException("El tipo de mantenimiento no debe estar en blanco");
        }
    }

    public static Cargo of(Cargo.Tipo cargo) {

        return new Cargo(cargo);
    }

    @Override
    public Cargo.Tipo value() {
        return cargo;
    }

    public enum Tipo {
        RECEPCIONISTA, INSTRUCTOR, MEDICO, ADMINISTRADOR;
    }
}