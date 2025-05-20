package com.saucedemo.tasks;
import com.saucedemo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String username;
    private final String passwor;

    public DoLogin(String username, String passwor) {
        this.username = username;
        this.passwor = passwor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(passwor).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)//debe ir un una task
        );
    }

    public static DoLogin withCredentials (String username, String passwor){
        return instrumented(DoLogin.class, username, passwor);
    }
}
