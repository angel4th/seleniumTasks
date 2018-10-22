Feature: Register a new user

  Scenario: Create a new user in the page
    Given I am a new user
    When I register my data correctly in the page for a new user
    Then I should get a welcome message

  Scenario: Sign-in and book a flight
    Given I sign-in with my credentials mercury and mercury
    And I select my flight details
    And I select a departure and return flight
    And I purchase the flight
    Then I return to home page