package runners;

//Especifica con que herramienta se va a correr

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


//Indicamos donde estarán relacionados los pasos del Run
@CucumberOptions(
        //Indica donde está el feature
        features = "src/test/resources/features/CP2CreacionPlanTradicionalComision.feature",
        //Indica donde estaran los steps
        glue = "stepDefinitions",
        //Los tags utilizados para la ejecución de diversos escenarios
        tags ="",
        //Definimos la nomenclatura
        snippets = SnippetType.CAMELCASE
)

public class CP2CreacionPlanTradicionalComisionRunner {
}
