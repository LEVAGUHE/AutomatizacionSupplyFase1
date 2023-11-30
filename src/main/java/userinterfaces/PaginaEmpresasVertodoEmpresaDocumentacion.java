package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//hacemos un extend para que la clase se convierta en un PageObject
public class PaginaEmpresasVertodoEmpresaDocumentacion extends PageObject {

    public static final Target BOTON_USUARIO = Target.the("clic correo para cerrar sesion").locatedBy("//button/span[contains(text(),'@')]");
    public static final Target BOTON_CERRARSESION = Target.the("cerrar sesión").locatedBy("//button[contains(text(), 'Cerrar sesión')]");

}
