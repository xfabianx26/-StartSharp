package org.choucair.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.choucair.utils.Constants.WEB_URL;

public class OpenUp implements Task {
    private  final EnvironmentVariables environmentVariables;

    public OpenUp(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(baseUrl));
    }

    public static OpenUp thePage(EnvironmentVariables environmentVariables) {
        return instrumented(OpenUp.class, environmentVariables);
    }
}
