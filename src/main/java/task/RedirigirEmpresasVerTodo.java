package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PaginaEmpresasVertodoEmpresaDocumentacion.*;

//para que la clase funcione de la forma requerida si implementa Task
public class RedirigirEmpresasVerTodo implements Task{
    //Se crean las variables globales
    private String Usuario;

    //Constructor para inicializar variables
    public RedirigirEmpresasVerTodo(String Usuario) {
        this.Usuario = Usuario;
    }

    //Método que se ejecutará al llamar la clase donde se indica las acciones a ejecutar
    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(

                Click.on(BOTON_USUARIO),
                Click.on((Target) BOTON_CERRARSESION)
        );

    }

    public static RedirigirEmpresasVerTodo MenuEmpresaVerTodo(String Usuario) {
        return instrumented(RedirigirEmpresasVerTodo.class, Usuario);
    }

}
