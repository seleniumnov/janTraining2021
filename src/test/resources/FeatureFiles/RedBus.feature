Feature: Red bus scenarios
  I want to use this template for my feature file

  @tag1
  Scenario: Booking of a Bus Ticket
    Given I Navigate to Red bus
    And I select Location From
    When I select Destination To
    Then I select the Journey Date
    And I click on the search bus
    Then I select DEPARTURE TIME
    And I find Mornting star travel and check the view seats
