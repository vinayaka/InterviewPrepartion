Feature: Pizza Order

  Scenario: Order a pizza with a count of 4
    Given I have an empty pizza order
    When I add 4 pizzas to the order
    Then the order count should be 4