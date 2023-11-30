package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.FormularioAgregarEmpresa.*;

//para que la clase funcione de la forma requerida si implementa Task
public class diligenciarDatosObligatoriosCrearPagador implements Task {

    //Se crean las variables globales
    private List<String> datos;

    //Constructor para inicializar variables
    public diligenciarDatosObligatoriosCrearPagador(List<String> datos) {
        this.datos = datos;
    }


    //Método que se ejecutará al llamar la clase donde se indica las acciones a ejecutar
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on((Target) BOTON_AGREGAREMPRESA)
        );

        switch (datos.get(0)) {
            case "NT":
                actor.attemptsTo(
                        Click.on((Target) LIST_TIPODOCUMENTO),
                        Click.on((Target) ITEM_TIPODOCUMENTO_NT));
                break;
            case "CC":
                actor.attemptsTo(
                        Click.on((Target) LIST_TIPODOCUMENTO),
                        Click.on((Target) ITEM_TIPODOCUMENTO_CC));
                break;
            case "CE":
                actor.attemptsTo(
                        Click.on((Target) LIST_TIPODOCUMENTO),
                        Click.on((Target) ITEM_TIPODOCUMENTO_CE));
                break;
            case "PA":
                actor.attemptsTo(
                        Click.on((Target) LIST_TIPODOCUMENTO),
                        Click.on((Target) ITEM_TIPODOCUMENTO_PA));
                break;
            case "PS":
                actor.attemptsTo(
                        Click.on((Target) LIST_TIPODOCUMENTO),
                        Click.on((Target) ITEM_TIPODOCUMENTO_PS));
                break;
        }

        actor.attemptsTo(
                Enter.theValue(datos.get(1)).into(INPUT_NUMDOCUMENTO)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Enter.theValue(datos.get(2)).into(INPUT_RAZONSOCIAL),
                Click.on((Target) LIST_TIPOPRODUCTO),
                Click.on((Target) ITEM_TIPOPRODUCTO),
                Click.on((Target) LIST_DEPARTAMENTO),
                Click.on((Target) ITEM_DEPARTAMENTO),
                Click.on((Target) LIST_CIUDAD),
                Click.on((Target) ITEM_CIUDAD),
                Enter.theValue(datos.get(3)).into(INPUT_CIIU),
                Click.on((Target) LIST_DIRESPECIALIST),
                Click.on((Target) ITEM_DIRESPECIALIST),
                Enter.theValue(datos.get(4)).into(INPUT_EMAIL),
                Enter.theValue(datos.get(5)).into(INPUT_NOMBRE),
                Enter.theValue(datos.get(6)).into(INPUT_APE),
                Click.on((Target) LIST_TIPODOCCONT),
                Click.on((Target) ITEM_TIPODOCCONTACT),
                Enter.theValue(datos.get(7)).into(INPUT_NUMDOCCONT),
                Enter.theValue(datos.get(8)).into(INPUT_TEL)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on((Target) BOTON_CREARREGISTRO)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static diligenciarDatosObligatoriosCrearPagador diligenciarCampos(List<String> datos) {
        return instrumented(diligenciarDatosObligatoriosCrearPagador.class, datos);
    }

}
