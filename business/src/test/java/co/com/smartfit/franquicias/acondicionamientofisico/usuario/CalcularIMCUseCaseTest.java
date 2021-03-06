package co.com.smartfit.franquicias.acondicionamientofisico.usuario;

import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.commands.CalcularIMC;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.CuentaCreada;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.EvaluacionFisicaCreada;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.IMCCalculado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.events.UsuarioCreado;
import co.com.smartfit.franquicias.acondicionamientofisico.agregadousuario.values.*;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Email;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Nombre;
import co.com.smartfit.franquicias.acondicionamientofisico.genericos.Telefono;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalcularIMCUseCaseTest {

    @InjectMocks
    private CalcularIMCUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void calcularIMCHappyPass(){
        //Arrange
        var command = new CalcularIMC(UsuarioId.of("Usuario-001"),
                EvaluacionFisicaId.of("Ev-F00001"),
                Peso.of(105.5D),
                Altura.of(1.70D));

        when(repository.getEventsBy("Usuario-001")).thenReturn(usuarios());
        useCase.addRepository(repository);

        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getUsuarioId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Asserts
        var imcCalculado = (IMCCalculado)events.get(0);
        Assertions.assertEquals(105.5D, imcCalculado.getPeso().value());
    }

    private List<DomainEvent> usuarios(){
        var event1 = new UsuarioCreado(UsuarioId.of("Usuario001"),
                Nombre.of("Camilo Andr??s Zuluaga"),
                Telefono.of("3113013030"),
                Email.of("juanK@usuario.com"));

        event1.setAggregateRootId("Usuario-001");

        var event2 = new CuentaCreada(CuentaId.of("Cta-001"),
                Mensualidad.of(150000D),
                Plan.of(Plan.Tipo.PLAN_B??SICO));

        event2.setAggregateRootId("Usuario-001");

        var event3 = new EvaluacionFisicaCreada(EvaluacionFisicaId.of("Ev-F00001"),
                Peso.of(105.5D),
                Altura.of(1.70D));
        event3.setAggregateRootId("Usuario-001");

        return List.of(event1, event2, event3);
    }

}