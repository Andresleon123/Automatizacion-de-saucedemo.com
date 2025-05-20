package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompra {

    public static final Target PRIMER_NOMBRE = Target.the("campo de texto para el nombre")
            .located(By.id("first-name"));

    public static final Target SEGUNDO_NOMBRE = Target.the("campo de texto para el apellido ")
            .located(By.id("last-name"));

    public static final Target CODIGO_POSTAL = Target.the("campo del codigo postal")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUAR = Target.the("botón de continuar")
            .located(By.id("continue"));

    public static final Target BTN_FINALIZAR_COMPRA = Target.the("boton de finalizar compra")
            .located(By.id("finish"));

    public static final Target MENSAJE_COMPRA_EXITOSA = Target
            .the("mensaje de compra exitosa")
            .locatedBy("//h2[@class='complete-header' and text()='Thank you for your order!']");

}

