package org.choucair.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INPUT_USER_NAME = Target.the("username field")
            .located(By.xpath("//input[@id='LoginPanel0_Username']"));

    public static final Target INPUT_PASSWORD = Target.the("password field")
            .located(By.xpath("//input[@id='LoginPanel0_Password']"));

    public static final Target BUTTON_LOGIN = Target.the("login button")
            .located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));


    public static final Target ERROR_MESSAGE = Target.the("error message")
            .located(By.xpath("//div[contains(@class, 'toast-error')]"));



    public static final Target DASHBOARD_TEXT = Target.the("Dashboard title")
            .located(By.xpath("//section//h1[contains(text(), 'Tablero')]"));
}
