package org.choucair.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.choucair.questions.BusinessUnitValidation;
import org.choucair.tasks.FillBusinessUnitForm;
import org.choucair.ui.NavigationUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BusinessUnitStepDefinitions {



    @When("the user navigates to the {string} menu")
    public void theUserNavigatesToTheMenu(String menuName) {
        if ("Reunión".equalsIgnoreCase(menuName)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.MENU_MEETING)
            );
        }
    }

    @And("selects {string}")
    public void selects(String submenu) {
        if ("Unidades de negocio".equalsIgnoreCase(submenu)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.SUBMENU_BUSINESS_UNITS)
            );
        }
    }

    @And("clicks on {string}")
    public void clicksOn(String button) {
        if ("Nuevo Unidad de negocio".equalsIgnoreCase(button)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.NEW_BUSINESS_UNIT_BUTTON)
            );
        }
    }

    @And("fills the form with name {string} and parent unit {string}")
    public void fillsTheFormWithNameAndParentUnit(String name, String parentUnit) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillBusinessUnitForm.withDetails(name, parentUnit)
        );
    }

    @Then("the new business unit {string} should be saved successfully")
    public void theNewBusinessUnitShouldBeSavedSuccessfully(String unitName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The business unit is visible in the table",
                        BusinessUnitValidation.isVisible(unitName))
        );
    }



}
