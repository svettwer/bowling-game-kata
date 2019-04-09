Feature: Bowling game

  Scenario: An awful game
    Given I start a new game
    When I roll 0 all the time
    Then the score should be 0