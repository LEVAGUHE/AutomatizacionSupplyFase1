package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

public class CP2CreacionPlanTradicionalComisionStep {

    //abrimos el navegador
    @Managed(driver = "firefox")
    private WebDriver navegador;
    //Nombramos el actor
    private Actor FuncionarioBanco = Actor.named("FuncionarioBanco");
    //instanciamos las páginas
    private HomePage homePage = new HomePage();

    @Dado("^El usuario se loguea en la plataforma con las credenciales leidygutierrez(\\d+)@yopmail\\.com, Pass(\\d+)\\*$")
    public void elUsuarioSeLogueaEnLaPlataformaConLasCredencialesLeidygutierrezYopmailComPass(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Dado("^Ingresa a la información de la empresa Pagadora$")
    public void ingresaALaInformaciónDeLaEmpresaPagadora() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^Da clic en el botón Crear Plan en el menú Empresas>Ver todo> “Nombre de la empresa”>Condiciones financieras$")
    public void daClicEnElBotónCrearPlanEnElMenúEmpresasVerTodoNombreDeLaEmpresaCondicionesFinancieras() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^Ingrese los datos obligatorios para un plan tradicional del producto Comisión$")
    public void ingreseLosDatosObligatoriosParaUnPlanTradicionalDelProductoComisión(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^Se debería poder crear correctamente el plan de financiación tradicional leidygutierrez(\\d+)@yopmail\\.com$")
    public void seDeberíaPoderCrearCorrectamenteElPlanDeFinanciaciónTradicionalLeidygutierrezYopmailCom(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    Process finished with exit code 0


}
