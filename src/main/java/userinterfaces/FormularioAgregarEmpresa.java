package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

//Se identifican los componentes de interacción con la página
public class FormularioAgregarEmpresa extends PageObject {

    public static final Target BOTON_AGREGAREMPRESA = Target.the("boton de crear").locatedBy("//button[@class='mat-flat-button mat-button-base mat-primary ng-star-inserted']");
    public static final Target LIST_TIPODOCUMENTO = Target.the("Despliega la lista de los tipos de documentos").located(By.name("enterprise-document-type")).waitingForNoMoreThan(Duration.ofSeconds(15));

    public static final Target ITEM_TIPODOCUMENTO_NT = Target.the("selecciona el tipo de documento").locatedBy("//div/mat-option[1]");
    public static final Target ITEM_TIPODOCUMENTO_CC = Target.the("selecciona el tipo de documento").locatedBy("//div/mat-option[2]");
    public static final Target ITEM_TIPODOCUMENTO_CE = Target.the("selecciona el tipo de documento").locatedBy("//div/mat-option[3]");
    public static final Target ITEM_TIPODOCUMENTO_PA = Target.the("selecciona el tipo de documento").locatedBy("//div/mat-option[4]");
    public static final Target ITEM_TIPODOCUMENTO_PS = Target.the("selecciona el tipo de documento").locatedBy("//div/mat-option[5]");
    public static final Target INPUT_NUMDOCUMENTO = Target.the("registra el número de documento").locatedBy("//input[@placeholder='Ejemplo: 9008762562']").waitingForNoMoreThan(Duration.ofSeconds(40));
    public static final Target INPUT_RAZONSOCIAL = Target.the("registra la razón social").locatedBy("//input[@placeholder='Razón social']");
    public static final Target LIST_TIPOPRODUCTO = Target.the("Despliega la lista de los tipos de productos").locatedBy("//span[contains(text(), 'Tipo de producto')]").waitingForNoMoreThan(Duration.ofSeconds(15));
    public static final Target ITEM_TIPOPRODUCTO = Target.the("selecciona el tipo de producto").locatedBy("//span[contains(text(), 'Unidirecto')]");
    public static final Target LIST_DEPARTAMENTO = Target.the("Despliega la lista de los departamentos").locatedBy("//input[@placeholder='Departamento']").waitingForNoMoreThan(Duration.ofSeconds(15));
    public static final Target ITEM_DEPARTAMENTO = Target.the("selecciona el departamento").locatedBy("//span[contains(text(), 'BOGOTA  D.C.')]");
    public static final Target LIST_CIUDAD = Target.the("Despliega la lista de las ciudades").locatedBy("//input[@placeholder='Ciudad']").waitingForNoMoreThan(Duration.ofSeconds(15));
    public static final Target ITEM_CIUDAD = Target.the("selecciona la ciudad").locatedBy("//span[contains(text(), 'BOGOTA')]");
    public static final Target INPUT_CIIU = Target.the("registra el CIIU").locatedBy("//input[@placeholder='CIIU']").waitingForNoMoreThan(Duration.ofSeconds(30));;
    public static final Target LIST_DIRESPECIALIST = Target.the("Despliega la lista de los directores/especialistas").locatedBy("//mat-select[@aria-label='Director / Especialista del producto']").waitingForNoMoreThan(Duration.ofSeconds(15));
    public static final Target ITEM_DIRESPECIALIST = Target.the("selecciona el director/especialista").locatedBy("//span[contains(text(), 'Cali - Irma Luisa Charria Yusti')]");
    public static final Target INPUT_EMAIL = Target.the("registra el email de contacto").locatedBy("//input[@placeholder='ejemplo@ejemplo.com']");
    public static final Target INPUT_NOMBRE = Target.the("registra el nombre de contacto").locatedBy("//input[@formcontrolname='name']");
    public static final Target INPUT_APE = Target.the("registra el primer apellido de contacto").locatedBy("//input[@formcontrolname='firstSurname']");
    public static final Target LIST_TIPODOCCONT = Target.the("Despliega la lista de los tipos de documentos del contacto").locatedBy("//mat-select[@id='mat-select-5']").waitingForNoMoreThan(Duration.ofSeconds(15));
    public static final Target ITEM_TIPODOCCONTACT = Target.the("selecciona el tipo de documento del contacto").locatedBy("//span[contains(text(), 'Cédula de Ciudadanía')]");
    public static final Target INPUT_NUMDOCCONT = Target.the("registra el numero del documento de contacto").locatedBy("//input[@formcontrolname='documentNumber']");
    public static final Target INPUT_TEL = Target.the("registra el numero de telefono de contacto").locatedBy("//input[@placeholder='Ejemplo: 6017462060']");
    public static final Target BOTON_CREARREGISTRO = Target.the("boton de crear").locatedBy("//span[contains(text(), ' Crear registro ')]").waitingForNoMoreThan(Duration.ofSeconds(120));

}
