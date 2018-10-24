@FirstFeature
Feature: Register a new user

  Scenario: Create a new user in the page
    Given I am a new user
    When I register my data correctly in the page for a new user
    | First Name | Last Name | Phone      | Email                      | Address 1 | Address 2 | City   | State   | Postal Code | Country       | Username  | Password |
    | Angel      | Aguilar   | 9991086664 | angel.aguilar0@hotmail.com | Mulsay    | Mulsay 2  | Merida | Yucatan | 97249       | UNITED STATES | angrarof  | pasd123  |
    Then I should get a welcome message

  Scenario Outline: Create multiple users in the page
    Given I am a new user
    When I register my data correctly in the page for a new user
      | First Name | Last Name | Phone      | Email                      | Address 1 | Address 2 | City   | State   | Postal Code | Country       | Username  | Password |
      | <First Name> | <Last Name> | <Phone>      | <Email>                      | <Address 1> | <Address 2> | <City>   | <State>   | <Postal Code> | <Country>       | <Username>  | <Password> |
    Then I should get a welcome message
    Examples:
      | First Name | Last Name | Phone      | Email                      | Address 1 | Address 2 | City   | State   | Postal Code | Country       | Username  | Password |
      | Angel      | Aguilar   | 9991086664 | angel.aguilar0@hotmail.com | Mulsay    | Mulsay 2  | Merida | Yucatan | 97249       | UNITED STATES | angrarof  | pasd123  |
      | Angel 2    | Aguilar 2 | 9991086665 | angel.aguilar1@hotmail.com | Mulsay    | Mulsay 2  | Merida | Yucatan | 97249       | UNITED STATES | angrarof2 | pasd123  |
      | Angel  3   | Aguilar 3 | 9991086666 | angel.aguilar2@hotmail.com | Mulsay    | Mulsay 2  | Merida | Yucatan | 97249       | UNITED STATES | angrarof3 | pasd123  |
