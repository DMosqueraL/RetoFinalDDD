package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Repeticion implements ValueObject<Integer> {

    private final Integer repeticion;

    public Repeticion(Integer repeticion) {
        this.repeticion = Objects.requireNonNull(repeticion);

        if (this.repeticion <= 2) {
            throw new IllegalArgumentException("La repeticion de los ejercicios no puede ser inferior a 2");
        }

        if (String.valueOf(this.repeticion).isBlank()) {
            throw new IllegalArgumentException("La repeticion de los ejercicios no debe estar en blanco");
        }
    }

    public static Repeticion of(Integer repeticion) {
        return new Repeticion(repeticion);
    }

    @Override
    public Integer value() {
        return repeticion;
    }
}
