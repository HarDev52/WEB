package com.nttdata.stepsdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class MyStoreStepdefs {
    @Dado("que me encuentro en la página de login de MyStore")
    public void queMeEncuentroEnLaPaginaDeLoginDeMyStore() {
        
    }

    @Cuando("inicio sesion con las credenciales usuario: {string} y contraseña: {string}")
    public void inicioSesionConLasCredencialesUsuarioYContrasena(String arg0, String arg1) {
    }

    @Entonces("valido que debería aparecer el texto de {string}")
    public void validoQueDeberiaAparecerElTextoDe(String arg0) {
        
    }

}
