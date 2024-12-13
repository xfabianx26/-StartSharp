





Feature: Navigate to Business Units

  Background:
    Given the user opens the StartSharp login page
    When the user enters their credentials
    Then the user validates that the credentials are correct

  @business-units
  Scenario: Navigate to the Business Units page and open the new unit form
    When the user navigates to the "Reunión" menu
    And selects "Unidades de negocio"
    And clicks on "Nuevo Unidad de negocio"
    And fills the form with name "Fabian" and parent unit "Marketing"
    Then the new business unit "Fabian" should be saved successfully
