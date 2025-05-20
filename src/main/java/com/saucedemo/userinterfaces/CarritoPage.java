package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static Target BOTON_AGREGAR_AL_CARRITO(String nombreProducto) {
        return Target.the("Botón para agregar el producto " + nombreProducto + " al carrito")
                .located(By.xpath("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button"));
    }

    public static final Target CANTIDAD_PRODUCTOS = Target.the("Icono del carrito para ver la cantidad de productos")
            .located(By.className("shopping_cart_badge"));

    public static final Target CARRITO_ICONO = Target.the("Icono del carrito para abrirlo")
            .located(By.className("shopping_cart_link"));

    public static final Target BTN_CHECKOUT = Target.the("Agrego la compra al carrito")
            .located(By.id("checkout"));
}
