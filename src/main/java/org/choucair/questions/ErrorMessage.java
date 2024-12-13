package org.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.choucair.ui.LoginUI;


public class ErrorMessage implements Question<Boolean> {

    private final String expectedText;

    public ErrorMessage(String expectedText) {
        this.expectedText = expectedText;
    }

    public static ErrorMessage isDisplayedWithText(String expectedText) {
        return new ErrorMessage(expectedText);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String actualText = LoginUI.ERROR_MESSAGE.resolveFor(actor).getText();
        return actualText.contains(expectedText);
    }
}
