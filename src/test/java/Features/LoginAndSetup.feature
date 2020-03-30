Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login and setup account
    Given I navigate to the login page
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click on the login
    Then I should see the userform page
    And I enter the following for User form
      | title | initial | firstName | middleName | gender | languagesKnown |
      | Mr.   | i       | Semin     | Palalic    | Male   | Hindi          |
    Then I click on save button


