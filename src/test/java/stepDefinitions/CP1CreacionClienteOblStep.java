package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.RedirigirEmpresasVerTodo;
import task.diligenciarDatosObligatoriosCrearPagador;
import task.ingresarPaginaPrincipal;
import userinterfaces.HomePage;


import java.util.List;

public class CP1CreacionClienteOblStep{

    //abrimos el navegador
    @Managed(driver = "firefox")
    private WebDriver navegador;
    //Nombramos el actor
    private Actor FuncionarioBanco = Actor.named("FuncionarioBanco");
    //instanciamos las páginas
    private HomePage homePage = new HomePage();

    @Dado("^El funcionario Banco ingresa a la plataforma con las credenciales (.*), (.*)$")
    public void elFuncionarioBancoIngresaALaPlataformaConLasCredencialesLeidygutierrezYopmailComPass(String usu, String pass) {
        //El actor se llamará FuncionarioBanco y en este metodo se abrirá el navegador
        FuncionarioBanco.can(BrowseTheWeb.with(navegador));
        FuncionarioBanco.wasAbleTo(
                Open.browserOn(homePage)
        );
        //Creamos el método para ejecutrar la tarea correspondiente
        FuncionarioBanco.wasAbleTo(
                ingresarPaginaPrincipal.ingresaUsuario(usu, pass)
        );


    }

    @Cuando("^Ingresa la información obligatoria en la creación de empresa$")
    public void ingresaLaInformaciónObligatoriaEnLaCreaciónDeEmpresa(List<String> datos) {
        //Creamos el método para ejecutrar la tarea correspondiente
        FuncionarioBanco.wasAbleTo(
                diligenciarDatosObligatoriosCrearPagador.diligenciarCampos(datos)
        );
    }

    @Entonces("^Se debe crear una nueva empresa en Empresas->Ver todas (.*)$")
    public void seDebeCrearUnaNuevaEmpresaEnEmpresasVerTodas(String Usuario) {

        FuncionarioBanco.wasAbleTo(
                RedirigirEmpresasVerTodo.MenuEmpresaVerTodo(Usuario)
        );

    }

}
