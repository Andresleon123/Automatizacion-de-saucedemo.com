package com.saucedemo.questions;

import com.saucedemo.userinterfaces.ConfirmarCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CompraExitosa implements Question<Boolean> {


    public static CompraExitosa seMuestra() {
        return new CompraExitosa();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(ConfirmarCompra.MENSAJE_COMPRA_EXITOSA).answeredBy(actor).isVisible();
    }
}
