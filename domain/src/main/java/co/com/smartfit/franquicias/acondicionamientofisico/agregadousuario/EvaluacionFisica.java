package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Altura;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.EvaluacionFisicaId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.IMC;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Peso;
import co.com.sofka.domain.generic.Entity;

public class EvaluacionFisica extends Entity<EvaluacionFisicaId> {

    protected Peso peso;
    protected Altura altura;
    protected IMC imc;

    public EvaluacionFisica(EvaluacionFisicaId evaluacionFisicaId, Peso peso, Altura altura, IMC imc){
        super(evaluacionFisicaId);
        this.peso = Peso.of(peso.value());
        this.altura = Altura.of(altura.value());
        this.imc = imc; /*IMC.of(calcularIMC(peso, altura))*/;
    }

    public void calcularIMC(Peso peso, Altura altura){
        var imc = (peso.value()/Math.pow(altura.value(), 2));
    }


}
