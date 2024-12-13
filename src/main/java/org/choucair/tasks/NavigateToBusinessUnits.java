package org.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.choucair.ui.NavigationUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToBusinessUnits  implements Task {


    public static NavigateToBusinessUnits openNewUnitForm() {
        return instrumented(NavigateToBusinessUnits.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NavigationUI.MENU_MEETING),
                Click.on(NavigationUI.SUBMENU_BUSINESS_UNITS),
                Click.on(NavigationUI.NEW_BUSINESS_UNIT_BUTTON)
        );
    }
}
