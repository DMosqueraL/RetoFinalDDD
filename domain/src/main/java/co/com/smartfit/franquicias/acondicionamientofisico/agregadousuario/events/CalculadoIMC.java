package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Altura;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.EvaluacionFisicaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Peso;
import co.com.sofka.domain.generic.DomainEvent;

public class CalculadoIMC extends DomainEvent {
    private final EvaluacionFisicaId evaluacionFisicaId;
    private final Peso peso;
    private final Altura altura;
    public CalculadoIMC(EvaluacionFisicaId evaluacionFisicaId, Peso peso, Altura altura) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.CalculadoIMC");
        this.evaluacionFisicaId = evaluacionFisicaId;
        this.peso = peso;
        this.altura = altura;
    }

    public EvaluacionFisicaId getEvaluacionFisicaId() {
        return evaluacionFisicaId;
    }

    public Peso getPeso() {
        return peso;
    }

    public Altura getAltura() {
        return altura;
    }
}
