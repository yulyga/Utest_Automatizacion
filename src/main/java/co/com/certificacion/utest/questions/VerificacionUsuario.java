package co.com.certificacion.utest.questions;

import co.com.certificacion.utest.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionUsuario implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String BotonComplete= actor.recall("boton").toString();
               return BotonComplete.equals("Complete Setup chevron_right");
    }
    public static VerificacionUsuario verificacionUsuario(){return new VerificacionUsuario();}
}
