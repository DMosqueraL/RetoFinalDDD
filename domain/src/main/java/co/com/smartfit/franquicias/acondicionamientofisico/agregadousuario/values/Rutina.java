package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class Rutina implements ValueObject<List<Object>> {

    private final Ejercicio ejercicio;
    private final Serie serie;
    private final Repeticion repeticion;
    private final List<Object> rutina = null;

    public Rutina(Ejercicio ejercicio, Serie serie, Repeticion repeticion) {
        this.ejercicio = Objects.requireNonNull(ejercicio);
        this.serie = Objects.requireNonNull(serie);
        this.repeticion = Objects.requireNonNull(repeticion);

        this.rutina.add(ejercicio);
        this.rutina.add(serie);
        this.rutina.add(repeticion);
    }

    /*public static Rutina of(List<Object> rutina) {
        return new Rutina(rutina);
    }*/

    @Override
    public List<Object> value() {
        return rutina;
    }
}
