package co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.ClaseId;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Duracion;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.Rutina;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.NombreCompleto;
import co.com.sofka.domain.generic.Entity;

public class Clase extends Entity<ClaseId> {
    protected ClaseId claseId;
    protected NombreCompleto nombreClase;
    protected Rutina rutina;
    protected Duracion duracion;


    public Clase(ClaseId entityId,
                 NombreCompleto nombreClase,
                 Rutina rutina,
                 Duracion duracion) {
        super(entityId);
        this.nombreClase = nombreClase;
        this.rutina = rutina;
        this.duracion = duracion;
    }

    public void cambiarNombreDeLaClase(ClaseId claseId, NombreCompleto nombreClase){
        this.claseId = ClaseId.of(claseId.value());
        this.nombreClase = NombreCompleto.of(nombreClase.value());
    }
}