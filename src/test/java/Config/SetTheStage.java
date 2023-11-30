package Config;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

public class SetTheStage {

    //Realizamos una función para que la asignación de usuario sea optima
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

}
