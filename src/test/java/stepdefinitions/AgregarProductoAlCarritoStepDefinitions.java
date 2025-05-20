package stepdefinitions;

import com.saucedemo.exceptions.MensajeDeCompraNoExitosa;
import com.saucedemo.questions.CompraExitosa;
import com.saucedemo.tasks.AgregarProducto;
import com.saucedemo.tasks.ConfirmarCompraLlenarFormulario;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoAlCarritoStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }

    @Dado("agrego el producto {string} al carrito")
    public void agregoElProductoAlCarrito(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito(producto)
        );
    }

    @Cuando("procedo a terminar el checkout")
    public void procedoATerminarElCheckout() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConfirmarCompraLlenarFormulario.Credenciales("Juan", "Perez", "1234")
        );
    }

    @Entonces("veremos la compra exitosa")
    public void veremosLaCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CompraExitosa.seMuestra()).orComplainWith(MensajeDeCompraNoExitosa.class, "No se muestra el mensaje de compra exitosa")
        );
    }
}

