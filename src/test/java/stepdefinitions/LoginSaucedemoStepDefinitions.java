package stepdefinitions;

import com.saucedemo.tasks.DoLogin;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;
import com.saucedemo.userinterfaces.LoginPage;

public class LoginSaucedemoStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Dado("que estoy en la página de inicio de SauceDemo")
    public void queEstoyEnLaPaginaDeInicioDeSauceDemo() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("juan").can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().attemptsTo(
                net.serenitybdd.screenplay.actions.Open.url("https://www.saucedemo.com")
        );
    }

    @Cuando("ingreso el usuario {string} y la contraseña {string}")
    public void ingresoElUsuarioYLaContraseña(String usuarioLogin, String contrasenaLogin) {
        OnStage.theActorInTheSpotlight().attemptsTo(DoLogin.withCredentials(usuarioLogin, contrasenaLogin));

    }

    @Entonces("debería ver la página de productos")
    public void deberiaVerLaPaginaDeProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginPage.PRODUCT_TITLE).isDisplayed()
        );
    }
}
