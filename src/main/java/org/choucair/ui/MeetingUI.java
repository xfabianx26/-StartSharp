package org.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingUI {

    public static final Target MEETING_NAME = Target.the("Nombre de la reunión")
            .locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");

    public static final Target MEETING_TYPE = Target.the("Tipo de reunión")
            .locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId");

    public static final Target MEETING_TYPE_OPTION = Target.the("Opción tipo de reunión")
            .locatedBy("//div[@class='select2-result-label' and text()='{0}']");


    public static final Target MEETING_NUMBER = Target.the("Número de reunión")
            .locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");

    public static final Target START_DATE = Target.the("Fecha de inicio")
            .locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']");

    public static final Target END_DATE = Target.the("Fecha de finalización")
            .locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']");

    public static final Target LOCATION = Target.the("Ubicación")
            .locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId");


    public static final Target LOCATION_OPTION = Target.the("Opción de ubicación")
            .locatedBy("//div[@class='select2-result-label' and text()='{0}']");



    public static final Target UNIT = Target.the("Unidad")
            .locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId");

    public static final Target UNIT_OPTION = Target.the("Opción de unidad")
            .locatedBy("//div[@class='select2-result-label' and text()='{0}']");


    public static final Target ORGANIZER = Target.the("Organizado por")
            .locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId");

    public static final Target ORGANIZER_OPTION = Target.the("Opción organizado por")
            .locatedBy("//div[@class='select2-result-label' and text()='{0}']");


    public static final Target REPORTER = Target.the("Reportero")
            .locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId");

    public static final Target REPORTER_OPTION = Target.the("Opción reportero")
            .locatedBy("//div[@class='select2-result-label' and text()='{0}']");


    public static final Target SAVE_BUTTON = Target.the("Guardar reunión")
            .locatedBy("//span[normalize-space()='Guardar']");

    public static final Target MEETING_NAME_CELL = Target.the("Celda con el nombre de la reunión {0}")
            .locatedBy("//div[@class='slick-cell l1 r1']/a[normalize-space(text())='{0}']");
}
