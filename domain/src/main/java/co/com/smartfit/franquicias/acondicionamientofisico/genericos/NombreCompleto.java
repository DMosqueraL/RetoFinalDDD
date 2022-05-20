package co.com.smartfit.franquicias.acondicionamientofisico.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<String> {
    private final String nombreCompleto;

    public NombreCompleto(String nombre) {

        this.nombreCompleto = Objects.requireNonNull(nombre);

        if (this.nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre completo no puede estar en blanco");
        }

        if (this.nombreCompleto.length() > 100) {
            throw new IllegalArgumentException("El nombre completo no permite más de 100 carácteres");
        }
    }

    public static NombreCompleto of(String nombre){
        return new NombreCompleto(nombre);
    }

    @Override
    public String value() {
        return nombreCompleto;
    }
}
