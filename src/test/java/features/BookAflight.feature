@BookAFlight
Feature: Book a flight

  Scenario: Sign-in and book a flight
    Given I sign-in with my credentials mercury and mercury
    And I select my flight details
    And I select a departure and return flight
    And I purchase the flight
    Then I return to home page