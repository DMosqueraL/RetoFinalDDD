package co.com.smartfit.franquicias.acondicionamientofisico.agregadosede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LectorHuella implements ValueObject<Object> {
    private final Object huella;

    public LectorHuella(Object huella) {

        this.huella = Objects.requireNonNull(huella);

        if (this.huella.equals("") || this.huella.equals(" ")){
            throw new IllegalArgumentException("La huella no puede estar en blanco o vacía");
        }
    }

    public static LectorHuella of(Object huella){
        return new LectorHuella(huella);
    }

    @Override
    public Object value() {
        return huella;
    }
}
