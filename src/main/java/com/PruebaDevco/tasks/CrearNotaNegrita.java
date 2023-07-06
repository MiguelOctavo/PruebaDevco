package com.PruebaDevco.tasks;

import com.PruebaDevco.model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.PruebaDevco.userinterfaces.NotaNegrita.*;

public class CrearNotaNegrita implements Task {

    private List<Datos> datos;
    public CrearNotaNegrita(List<Datos> datos) {
        this.datos = datos;
    }
    public static Performable enLaPagina(List<Datos> datos) {
        return Tasks.instrumented(CrearNotaNegrita.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NOTAS_ENRRIQUESIDAS),
                Click.on(BOTON_NEGRITA),
                Enter.theValue(datos.get(0).getStrNotaNegrita()).into(INPUT_EDITOR),
                Click.on(BOTON_NOTAS_GUARDAR)
        );
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
