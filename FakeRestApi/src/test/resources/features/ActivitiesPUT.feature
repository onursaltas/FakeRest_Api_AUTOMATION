Feature: User Create Feature


  Scenario Outline: User Create Scenario
    Given User Id '<id>', User Title '<title>',User DueDate '<dueDate>'
    When Put Activities
    Then Check response
    Examples:
      | id      | title                    | dueDate                       |
      | 0       | Player      | 2022-03-27T07:29:00.791Z      |
