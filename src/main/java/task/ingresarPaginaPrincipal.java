package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

//para que la clase funcione de la forma requerida si implementa Task
public class ingresarPaginaPrincipal implements Task {

    //Se crean las variables globales
    private String usu, pass;

    //Constructor para inicializar variables
    public ingresarPaginaPrincipal(String usu, String pass) {
        this.usu = usu;
        this.pass = pass;
    }

    //Método que se ejecutará al llamar la clase donde se indica las acciones a ejecutar
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usu).into((Target) INPUT_USUARIO),
                Click.on((Target) BOTON_CONTINUAR),
                Enter.theValue(pass).into((Target) INPUT_CONTRASENA),
                Click.on((Target) BOTON_INGRESAR)
        );

    }

    public static ingresarPaginaPrincipal ingresaUsuario(String usu, String pass) {
        return instrumented(ingresarPaginaPrincipal.class, usu, pass);
    }
}
