package org.choucair.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.choucair.ui.MeetingUI;
import org.choucair.utils.Constants;


public class FillMeetingForm implements Task {


    private final String meetingName;
    private final String meetingType;
    private final String meetingNumber;
    private final String startDate;
    private final String endDate;
    private final String location;
    private final String unit;
    private final String organizer;
    private final String reporter;

    public FillMeetingForm(String meetingName, String meetingType, String meetingNumber,
                           String startDate, String endDate, String location,
                           String unit, String organizer, String reporter) {
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.meetingNumber = meetingNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.unit = unit;
        this.organizer = organizer;
        this.reporter = reporter;
    }

    public static FillMeetingForm withDetails(String meetingName, String meetingType,
                                              String meetingNumber, String startDate,
                                              String endDate, String location, String unit,
                                              String organizer, String reporter) {
        return new FillMeetingForm(meetingName, meetingType, meetingNumber, startDate, endDate, location, unit, organizer, reporter);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingName).into(MeetingUI.MEETING_NAME),
                Click.on(MeetingUI.MEETING_TYPE),
                Click.on(MeetingUI.MEETING_TYPE_OPTION.of(meetingType)),
                Enter.theValue(meetingNumber).into(MeetingUI.MEETING_NUMBER),
                Enter.theValue(startDate).into(MeetingUI.START_DATE),
                Enter.theValue(endDate).into(MeetingUI.END_DATE),
                Click.on(MeetingUI.LOCATION),
                Click.on(MeetingUI.LOCATION_OPTION.of(location)),
                Click.on(MeetingUI.UNIT),
                Click.on(MeetingUI.UNIT_OPTION.of(unit)),
                Click.on(MeetingUI.ORGANIZER),
                Click.on(MeetingUI.ORGANIZER_OPTION.of(organizer)),
                Click.on(MeetingUI.REPORTER),
                Click.on(MeetingUI.REPORTER_OPTION.of(reporter)),
                Click.on(MeetingUI.SAVE_BUTTON)
        );
    }
}