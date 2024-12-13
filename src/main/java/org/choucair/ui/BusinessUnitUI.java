package org.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitUI {

    public static final Target NAME_FIELD = Target.the("Name field")
            .locatedBy("//input[@id='Serenity_Pro_Meeting_BusinessUnitDialog3_Name']");

    public static final Target PARENT_UNIT_DROPDOWN = Target.the("Parent Unit dropdown")
            .locatedBy("//div[@id='s2id_Serenity_Pro_Meeting_BusinessUnitDialog3_ParentUnitId']");

    public static final Target SELECT_OPTION = Target.the("Option in dropdown")
            .locatedBy("//div[@class='select2-result-label' and text()='Marketing']");

    public static final Target SAVE_BUTTON = Target.the("Save button")
            .locatedBy("//span[normalize-space()='Guardar']");

    public static final Target ROW_WITH_NAME = Target.the("Row with the given unit name")
            .locatedBy("//div[@class='slick-cell l2 r2']//a[contains(text(), '{0}')]");


}
