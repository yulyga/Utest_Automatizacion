package co.com.certificacion.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target Sign_up= Target.the("SIGN UP").
                locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
    public static final Target Nombre_registro= Target.the("Name registro").
                located(By.id("firstName"));
    public static final Target Apellido= Target.the("apellido").
            located(By.name("lastName"));
    public static final Target EMAIL= Target.the("email").
            located(By.id("email"));

    public static final Target Mes= Target.the("mes").
            locatedBy("//div[@class=\"col-xs-5 col-md-5 col-lg-5 months\"]");
    public static final Target Enero= Target.the("mes").
            locatedBy("//option[@label=\"January\"]");
    public static final Target Dia= Target.the("dia").
            locatedBy("//option[@label=\"2\"]");
    public static final Target Year= Target.the("año").
            locatedBy("//option[@label=\"2004\"]");


    public static final Target Boton_next= Target.the("boton").
            locatedBy("//a[@aria-label=\"Next step - define your location\"]");

    public static final Target Boton_next_ubicacion= Target.the("boton").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");



    public static final Target Boton_final= Target.the("boton final").
            locatedBy("//a[@aria-label=\"Next - final step\"]");

    public static final Target Password= Target.the("contraseña").
            located(By.id("password"));

    public static final Target Password_confirmacion= Target.the("contraseña confirmada").
            located(By.id("confirmPassword"));

    public static final Target Check_uno= Target.the("check uno").
            locatedBy("(//input[@type=\"checkbox\"])[2]");

    public static final Target Check_dos= Target.the("check dos").
            locatedBy("(//input[@type=\"checkbox\"])[3]");

    public static final Target Botonfinal= Target.the("botonfinal").
            locatedBy("//a[@aria-label=\"Complete Setup\"]");

}
