package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", // Carpeta de tus .feature
        glue = "stepdefinitions", // Paquete donde estarán tus pasos
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags =  "@agregaralcarrito"
)
public class    SauceDemoRunner {
}
