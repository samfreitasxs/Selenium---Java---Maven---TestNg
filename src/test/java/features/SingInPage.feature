Feature: Login User

  Scenario: Validar o acesso do usuario
    Given the user navigates to the login page
    When the user enters valid credentials
    Then the user can log in to the page