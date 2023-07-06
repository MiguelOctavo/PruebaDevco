package com.PruebaDevco.questions;

import com.PruebaDevco.model.Datos;
import com.PruebaDevco.userinterfaces.NotaNegrita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Validacion implements Question<Boolean> {
    private List<Datos> datos;

    public Validacion(List<Datos> datos) {
        this.datos = datos;
    }

    public static Validacion es(List<Datos> datos) {
        return new Validacion(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto_mensaje = Text.of(NotaNegrita.LABEL_NOMBRE_NOTA).viewedBy(actor).asString();
        return  datos.get(0).getGetSrtTextoFinal().equals(texto_mensaje);
    }
}
