Feature: Create a New Meeting

  Background:
    Given the user opens the StartSharp login page
    When the user enters their credentials
    Then the user validates that the credentials are correct

  @meetings
  Scenario: Create a New Meeting
    When the user navigates to the "Reunión" menu in the meetings section
    And selects the "Reuniones" submenu
    And clicks on the "Nuevo Reunión" button in meetings
    And fills the meeting form with the following details:
      | Meeting Name   | Tipo de reunión | Meeting Number | Start Date       | End Date         | Location | Unit     | Organizer    | Reporter    |
      | Weekly Meeting | General         | 0111           | 12/12/2024 12:10 | 12/12/2024 13:10 | HQ-01    | Marketing| Aaron Taylor | Aaron Taylor|
    Then the new meeting "Weekly Meeting" should appear in the list




