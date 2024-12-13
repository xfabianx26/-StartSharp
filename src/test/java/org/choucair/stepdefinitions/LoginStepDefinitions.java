package org.choucair.stepdefinitions;



import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.choucair.questions.CredentialsValidation;
import org.choucair.questions.DashboardVisibility;
import org.choucair.questions.ErrorMessage;
import org.choucair.tasks.Login;
import org.choucair.tasks.OpenUp;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;


public class LoginStepDefinitions {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

        environmentVariables = Injectors.getInjector().getInstance(EnvironmentVariables.class);
    }

    @Given("the user opens the StartSharp login page")
    public void theUserOpensTheStartSharpLoginPage() {
        OnStage.theActorCalled("User").wasAbleTo(
                OpenUp.thePage(environmentVariables)
        );
    }


    @When("the user enters their credentials")
    public void theUserEntersTheirCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials()
        );
    }

    @Then("the user validates that the credentials are correct")
    public void theUserValidatesThatTheCredentialsAreCorrect() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CredentialsValidation.isSuccessful())
        );
    }

    @Then("verifies that the Dashboard title is visible")
    public void verifiesThatTheDashboardTitleIsVisible() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(DashboardVisibility.isVisible())
        );
    }


    @When("the user enters invalid credentials")
    public void theUserEntersInvalidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withInvalidCredentials()
        );
    }

    @Then("the user validates that an error message is displayed")
    public void theUserValidatesThatAnErrorMessageIsDisplayed() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The error message should be displayed",
                        ErrorMessage.isDisplayedWithText("Error de validación: ¡Nombre de usuario o contraseña inválidos!"), is(true))
        );
    }

}
