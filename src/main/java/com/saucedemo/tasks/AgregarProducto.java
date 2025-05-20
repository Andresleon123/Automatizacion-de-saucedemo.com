package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.saucedemo.userinterfaces.CarritoPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private final String nombreProducto;

    public AgregarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static AgregarProducto alCarrito(String nombreProducto) {
        return instrumented(AgregarProducto.class, nombreProducto);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPage.BOTON_AGREGAR_AL_CARRITO(nombreProducto)),
                Click.on(CarritoPage.CARRITO_ICONO),
                Click.on(CarritoPage.BTN_CHECKOUT)
        );
    }
}
