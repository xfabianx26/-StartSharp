package org.choucair.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.choucair.ui.LoginUI;

import static org.choucair.utils.Constants.*;

public class Login  implements Task {

    private static EnvironmentVariables environmentVariables;

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(username).into(LoginUI.INPUT_USER_NAME),
                Enter.theValue(password).into(LoginUI.INPUT_PASSWORD),
                Click.on(LoginUI.BUTTON_LOGIN)
        );
    }


    public static Login withCredentials() {
        if (environmentVariables == null) {
            environmentVariables = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        }
        String user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER);
        String pass = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);

        return Tasks.instrumented(Login.class, user, pass);
    }
    public static Login withInvalidCredentials() {
        return Tasks.instrumented(Login.class, "fabian", "123");
    }

}
