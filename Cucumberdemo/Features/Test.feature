Feature: Proof of concept that my framework works
@smoketest
  Scenario: Launch Test triangle app
    Given User is in homepage
    When User check the checkbox
    And Click on next button
    Then User successfully go to signup page
    And User want to fill all details in signup page
    When Click on submit button
    Then User successfully go to booking page
    And User want to fill all details in booking page
    When click on confirm button
    Then User successfully go to Payment page
    And User want to fill all details in Payment page
    When click on pay now button
    Then User successfully go to confirmation page
    When Click on Home button
    Then User go to home page
