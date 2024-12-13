package org.choucair.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.choucair.ui.BusinessUnitUI;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusinessUnitValidation implements Question<Boolean> {

    private final String name;

    public BusinessUnitValidation(String name) {
        this.name = name;
    }

    public static BusinessUnitValidation isVisible(String name) {
        return new BusinessUnitValidation(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name provided to BusinessUnitValidation is null or empty!");
        }

        List<WebElementFacade> rows = BusinessUnitUI.ROW_WITH_NAME.of(name).resolveAllFor(actor);

        return rows.stream()
                .map(WebElement::getText)
                .anyMatch(text -> text.equalsIgnoreCase(name));
    }

}
