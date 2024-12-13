package org.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.choucair.ui.LoginUI;

public class DashboardVisibility implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.DASHBOARD_TEXT.resolveFor(actor).isVisible();
    }

    public static DashboardVisibility isVisible() {
        return new DashboardVisibility();
    }
}
