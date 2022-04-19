Feature: List Create Feature


  Scenario: User Create Scenario
    Given go to List Activities : '<id>'
    When List Activites
    Then Check the List Activite response

      | id      |
      | 0       |