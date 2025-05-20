package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("campo de usuario")
            .located(By.id("user-name"));

    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("botón de login")
            .located(By.id("login-button"));

    public static final Target PRODUCT_TITLE = Target.the("título de productos")
            .located(By.className("title"));
}
