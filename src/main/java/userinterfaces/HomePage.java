package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;


//Indicamos cual va a ser la URL a la que se accederá
@DefaultUrl("https://d24ezfigdsqm8q.cloudfront.net/sign-in")
//hacemos un extend para que la clase se convierta en un PageObject
public class HomePage extends PageObject {
    //Se identifican los componentes de interacción con la página
    public static final Target INPUT_USUARIO = Target.the("input para ingresar el usuario").located(By.id("mat-input-0"));
    public static final Target BOTON_CONTINUAR = Target.the("input para el botón continuar").locatedBy("//a[@class = 'mat-flat-button mat-button-base' and //span[contains(text(),'Continuar')] ]");
    public static final Target INPUT_CONTRASENA = Target.the("input para ingresar la contraseña").located(By.id("mat-input-1"));
    public static final Target BOTON_INGRESAR = Target.the("input para el botón ingresar").locatedBy("//a[@class = 'mat-flat-button mat-button-base' and //span[contains(text(),'Ingresar')] ]").waitingForNoMoreThan(Duration.ofSeconds(15));;
}
