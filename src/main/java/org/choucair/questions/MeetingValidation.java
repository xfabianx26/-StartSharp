package org.choucair.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.choucair.ui.MeetingUI;

import java.util.List;

public class MeetingValidation implements Question<Boolean> {
    private final String meetingName;

    public MeetingValidation(String meetingName) {
        this.meetingName = meetingName;
    }

    public static MeetingValidation isVisible(String meetingName) {
        return new MeetingValidation(meetingName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Si el elemento existe, significa que la reunión está visible
        return WebElementQuestion.the(MeetingUI.MEETING_NAME_CELL.of(meetingName))
                .answeredBy(actor)
                .isCurrentlyVisible();
    }
}