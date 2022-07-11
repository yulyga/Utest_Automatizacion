package co.com.certificacion.utest.tasks;

import co.com.certificacion.utest.interactions.Espera;
import co.com.certificacion.utest.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int valor= new Random().nextInt(10000+1)+1;
        actor.attemptsTo(
                Espera.espera(),
                Click.on(Home.Sign_up),
                Enter.theValue("yuli").into(Home.Nombre_registro),
                Enter.theValue("Madrid").into(Home.Apellido),
                Enter.theValue(valor+"yuliga31@gmail.com").into(Home.EMAIL),
                Click.on(Home.Enero),

                Click.on(Home.Dia),
                Click.on(Home.Year),
                Click.on(Home.Boton_next),
                Espera.espera(),
                Click.on(Home.Boton_next_ubicacion),
                Espera.espera(),

                Click.on(Home.Boton_final),
                Espera.espera(),
                Enter.theValue("12345678YuliMadrid").into(Home.Password),
                Espera.espera(),
                Enter.theValue("12345678YuliMadrid").into(Home.Password_confirmacion),
                Espera.espera(),
                Click.on(Home.Check_uno),
                Espera.espera(),
                Click.on(Home.Check_dos),
                Espera.espera()
                );
        actor.remember("boton",Home.Botonfinal.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(Home.Botonfinal),
                Espera.espera(),
                Espera.espera()
        );

    }
    public static Registro registro(){ return instrumented(Registro.class);}
}
