Feature: List Create Feature


  Scenario: User Create Scenario
    Given go to delete Activities : '<id>'
    When Process Activites
    Then Check the Delete Process response

      | id      |
      | 0       |