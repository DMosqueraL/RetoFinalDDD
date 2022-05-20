package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Serie implements ValueObject<Integer> {

    private final Integer serie;

    public Serie(Integer serie) {
        this.serie = Objects.requireNonNull(serie);

        if (this.serie <= 2) {
            throw new IllegalArgumentException("La serie de los ejercicios no puede ser inferior a 2");
        }

        if (String.valueOf(this.serie).isBlank()) {
            throw new IllegalArgumentException("La serie de los ejercicios no debe estar en blanco");
        }
    }

    public static Serie of(Integer serie){
        return new Serie(serie);
    }

    @Override
    public Integer value() {
        return serie;
    }
}
