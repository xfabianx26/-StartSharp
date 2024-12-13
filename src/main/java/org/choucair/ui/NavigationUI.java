package org.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NavigationUI {

    public static final Target MENU_MEETING = Target.the("Reunión menu")
            .locatedBy("//span[normalize-space()='Reunión']");

    public static final Target SUBMENU_BUSINESS_UNITS = Target.the("Unidades de negocio submenu")
            .locatedBy("//span[normalize-space()='Unidades de negocio']");

    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("Nuevo Unidad de negocio button")
            .locatedBy("//span[normalize-space()='Nuevo Unidad de negocio']");


    public static final Target SUBMENU_MEETINGS = Target.the("Reuniones submenu")
            .locatedBy("//span[normalize-space()='Reuniones']");

    public static final Target NEW_MEETING_BUTTON = Target.the("Nuevo Reunión button")
            .locatedBy("//span[normalize-space()='Nuevo Reunión']");
}
