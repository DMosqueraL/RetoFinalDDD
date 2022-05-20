package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ejercicio implements ValueObject<String> {
    private final String ejercicio;

    public Ejercicio(String documento) {
        this.ejercicio = Objects.requireNonNull(documento);

        if(this.ejercicio.isBlank()){
            throw new IllegalArgumentException("El ejercicio no puede estar en blanco.");
        }

        if(this.ejercicio.isEmpty()){
            throw new IllegalArgumentException("El ejercicio no puede estar vacío");
        }
    }

    public static Ejercicio of(String ejercicio){
        return new Ejercicio(ejercicio);
    }

    @Override
    public String value() {
        return ejercicio;
    }
}
