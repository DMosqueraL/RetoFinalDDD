package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Duracion;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Rutina;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Clase extends Entity<ClaseId> {
    protected ClaseId claseId;
    protected Nombre nombreClase;
    protected Rutina rutina;
    protected Duracion duracion;


    public Clase(ClaseId claseId,
                 Nombre nombreClase,
                 Rutina rutina,
                 Duracion duracion) {
        super(claseId);
        this.nombreClase = nombreClase;
        this.rutina = rutina;
        this.duracion = duracion;
    }

    public void cambiarNombreDeLaClase(ClaseId claseId, Nombre nombreClase) {
        this.claseId = claseId;
        this.nombreClase = nombreClase;
    }
}
