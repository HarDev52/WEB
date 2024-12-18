package com.nttdata.page;

import org.openqa.selenium.By;

public class MyStorePage {
    //Localizadores de elementos
    public static By IniciarSesion = By.xpath("//div[@class=\"user-info\"]/a");
    public static By user= By.xpath("//*[@id=\"field-email\"]");
    public static By pass = By.xpath("//*[@id=\"field-password\"]");
    public static By login = By.xpath("//*[@id=\"submit-login\"]");
}
