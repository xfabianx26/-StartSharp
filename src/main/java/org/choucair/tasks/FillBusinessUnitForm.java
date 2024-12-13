package org.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.choucair.ui.BusinessUnitUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillBusinessUnitForm  implements Task {

    private final String name;
    private final String parentUnit;

    public FillBusinessUnitForm(String name, String parentUnit) {
        this.name = name;
        this.parentUnit = parentUnit;
    }

    public static FillBusinessUnitForm withDetails(String name, String parentUnit) {
        return instrumented(FillBusinessUnitForm.class, name, parentUnit);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(BusinessUnitUI.NAME_FIELD),
                Click.on(BusinessUnitUI.PARENT_UNIT_DROPDOWN),
                Click.on(BusinessUnitUI.SELECT_OPTION),
                Click.on(BusinessUnitUI.SAVE_BUTTON)
        );
    }
}
