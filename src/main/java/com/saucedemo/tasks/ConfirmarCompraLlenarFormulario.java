package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.ConfirmarCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmarCompraLlenarFormulario implements Task {

    private final String primerNombre;
    private final String segundoNombre;
    private final String codigoPostal;

    public ConfirmarCompraLlenarFormulario(String primerNombre, String segundoNombre, String codigoPostal) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(primerNombre).into(ConfirmarCompra.PRIMER_NOMBRE),
                Enter.theValue(segundoNombre).into(ConfirmarCompra.SEGUNDO_NOMBRE),
                Enter.theValue(codigoPostal).into(ConfirmarCompra.CODIGO_POSTAL),
                Click.on(ConfirmarCompra.BTN_CONTINUAR),
                Click.on(ConfirmarCompra.BTN_FINALIZAR_COMPRA)

                //debe ir un una task
        );
    }

    public static ConfirmarCompraLlenarFormulario Credenciales (String primerNombre, String segundoNombre, String codigoPostal){
        return instrumented(ConfirmarCompraLlenarFormulario.class, primerNombre, segundoNombre, codigoPostal);
    }
}

