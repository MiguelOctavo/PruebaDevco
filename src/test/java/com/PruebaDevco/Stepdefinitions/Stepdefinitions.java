package com.PruebaDevco.Stepdefinitions;


import com.PruebaDevco.model.Datos;
import com.PruebaDevco.questions.Validacion;
import com.PruebaDevco.tasks.AbrirPagina;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.PruebaDevco.tasks.CrearNotaNegrita;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Stepdefinitions {

    @Before
    public void setOnStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Que el usuario ingresa a  bloc de notas online$")
    public void queElUsuarioIngresaABlocDeNotasOnline(){
        theActorCalled("Miguel").wasAbleTo(
                AbrirPagina.enLaPagina()
        );
    }

    @When("^Selecciona Nota de texto enriquecido y diligencia la nota$")
    public void seleccionaNotaDeTextoEnriquecidoYDiligenciaLaNota(List<Datos> datos){
        theActorInTheSpotlight().attemptsTo(
                CrearNotaNegrita.enLaPagina(datos)
        );
    }

    @Then("^Se valida que se crea la nota$")
    public void seValidaQueSeCreaLaNota(List<Datos> datos){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validacion.es(datos)));
    }

}
