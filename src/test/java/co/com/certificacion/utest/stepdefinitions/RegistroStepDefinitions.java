package co.com.certificacion.utest.stepdefinitions;


import co.com.certificacion.utest.questions.VerificacionUsuario;
import co.com.certificacion.utest.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class RegistroStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brandon");
    }
    @Dado("^soy un usuario de utest sin credenciales$")
    public void soyUnUsuarioDeUtestSinCredenciales() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }

    @Cuando("^ingreso informacion necesaria para creacion de usuario$")
    public void ingresoInformacionNecesariaParaCreacionDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Registro.registro());
    }

    @Entonces("^se realiza el registro exitoso$")
    public void seRealizaElRegistroExitoso() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionUsuario.verificacionUsuario(), Matchers.is(true)));
           }

}
