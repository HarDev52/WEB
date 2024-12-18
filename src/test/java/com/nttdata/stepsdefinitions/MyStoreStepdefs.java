package com.nttdata.stepsdefinitions;

import com.nttdata.page.MyStorePage;
import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.MyStoreLoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MyStoreStepdefs {

    private WebDriver driver;
    MyStoreLoginSteps StoreLogin;

    @Dado("que me encuentro en la página de login de MyStore")
    public void queMeEncuentroEnLaPaginaDeLoginDeMyStore() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        StoreLogin = new MyStoreLoginSteps(driver);
        screenShot();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Y("selecciono Iniciar sesion")
    public void seleccionoIniciarSesion() {
        StoreLogin.Iniciarsesion();
    }

    @Cuando("inicio sesion con las credenciales usuario: {string} y contraseña: {string}")
    public void inicioSesionConLasCredencialesUsuarioYContrasena(String user, String password) {
        StoreLogin = new MyStoreLoginSteps(driver);
        StoreLogin.typeUser(user);
        StoreLogin.typePassword(password);
        StoreLogin.login();
        screenShot();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //@Entonces("valido que debería aparecer el texto de {string}")
    //public void validoQueDeberiaAparecerElTextoDe(String arg0) {
    //}



}
