package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ProductoEnCarrito implements Question<Boolean> {

    private final String producto;

    public ProductoEnCarrito(String producto) {
        this.producto = producto;
    }

    public static ProductoEnCarrito conNombre(String producto) {
        return new ProductoEnCarrito(producto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target productoEnCarrito = Target.the("producto dentro del carrito")
                .locatedBy("//div[@class='inventory_item_name' and text()='" + producto + "']");

        return the(productoEnCarrito).answeredBy(actor).isVisible();
    }
}//realizar task rellenar formularios
//como se hace una question
