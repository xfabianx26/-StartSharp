package org.choucair.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.choucair.questions.MeetingValidation;
import org.choucair.tasks.FillMeetingForm;
import org.choucair.ui.NavigationUI;
import org.choucair.utils.Constants;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MeetingStepDefinitions {

    @When("the user navigates to the {string} menu in the meetings section")
    public void theUserNavigatesToTheMenuInTheMeetingsSection(String menuName) {
        if ("Reunión".equalsIgnoreCase(menuName)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.MENU_MEETING)
            );
        }
    }

    @And("selects the {string} submenu")
    public void selectsTheSubmenu(String submenu) {
        if ("Reuniones".equalsIgnoreCase(submenu)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.SUBMENU_MEETINGS)
            );
        }
    }

    @And("clicks on the {string} button in meetings")
    public void clicksOnTheButtonInMeetings(String button) {
        if ("Nuevo Reunión".equalsIgnoreCase(button)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(NavigationUI.NEW_MEETING_BUTTON)
            );
        }
    }

    @And("fills the meeting form with the following details:")
    public void fillsTheMeetingFormWithTheFollowingDetails(io.cucumber.datatable.DataTable data) {
        List<Map<String, String>> rows = data.asMaps(String.class, String.class);
        Map<String, String> meetingData = rows.get(0);

        String meetingName = meetingData.get("Meeting Name");
        String meetingType = meetingData.get("Tipo de reunión");
        String meetingNumber = meetingData.get("Meeting Number");
        String startDate = meetingData.get("Start Date");
        String endDate = meetingData.get("End Date");
        String location = meetingData.get("Location");
        String unit = meetingData.get("Unit");
        String organizer = meetingData.get("Organizer");
        String reporter = meetingData.get("Reporter");

        OnStage.theActorInTheSpotlight().attemptsTo(
                FillMeetingForm.withDetails(meetingName, meetingType, meetingNumber, startDate, endDate, location, unit, organizer, reporter)
        );
    }

    @Then("the new meeting {string} should appear in the list")
    public void theNewMeetingShouldAppearInTheList(String meetingName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("La reunión con el nombre " + meetingName + " debería estar visible",
                        MeetingValidation.isVisible(meetingName))
        );
    }



}
