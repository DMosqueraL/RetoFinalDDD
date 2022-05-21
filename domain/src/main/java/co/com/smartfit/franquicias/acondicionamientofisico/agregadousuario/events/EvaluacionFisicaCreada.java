package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Altura;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.EvaluacionFisicaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.IMC;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Peso;
import co.com.sofka.domain.generic.DomainEvent;

public class EvaluacionFisicaCreada extends DomainEvent {

    private final EvaluacionFisicaId evaluacionFisicaId;
    private final Peso peso;
    private final Altura altura;
    private final IMC imc;

    public EvaluacionFisicaCreada(EvaluacionFisicaId evaluacionFisicaId, Peso peso, Altura altura, IMC imc) {
        super("co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.EvaluacionFisicaCreada");
        this.evaluacionFisicaId = evaluacionFisicaId;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public Peso getPeso() {
        return peso;
    }

    public Altura getAltura() {
        return altura;
    }

    public IMC getImc() {
        return imc;
    }
}
