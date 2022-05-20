package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Altura;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.EvaluacionFisicaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.IMC;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Peso;
import co.com.sofka.domain.generic.Command;

public class CrearEvaluacionFisica extends Command {

    private final EvaluacionFisicaId evaluacionFisicaId;
    private final Peso peso;
    private final Altura altura;
    private final IMC imc;

    public CrearEvaluacionFisica(EvaluacionFisicaId evaluacionFisicaId,
                                 Peso peso, Altura altura, IMC imc) {
        this.evaluacionFisicaId = evaluacionFisicaId;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
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

    public IMC getImc() {
        return imc;
    }
}
