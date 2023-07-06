package com.PruebaDevco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotaNegrita {
    public static final Target INPUT_NOMBRE_NOTA = Target.the("Nombre nota").located(By.id("noteName"));

    public static final Target LABEL_NOMBRE_NOTA = Target.the("Nombre nota").located(By.xpath("/html/body/div[2]/section[1]/div/div/div[4]/div[3]/div/div[1]/a"));
    public static final Target BOTON_NOTAS_ENRRIQUESIDAS = Target.the("Nota enrriquesidas").located(By.id("richtextnote-tab"));
    public static final Target INPUT_EDITOR= Target.the("BEditor").located(By.id("editor"));
    public static final Target BOTON_NEGRITA= Target.the("Boton negrita").located(By.xpath("/html/body/div[2]/section[1]/div/div/div[3]/div[3]/div[2]/main/div/div/div[1]/div/div[1]/button[1]"));

    public static final Target BOTON_NOTAS_GUARDAR = Target.the("Boton guardar").located(By.xpath("/html/body/div[2]/section[1]/div/div/div[3]/div[3]/div[2]/div/button"));
}
