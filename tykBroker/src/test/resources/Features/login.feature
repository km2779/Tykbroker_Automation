#Author: Khalad Mahabub
#Date: 7/25/2023
#Description:
#			User Story - As a TYKBROKER user, I need to be able to log in successfully.
#@login
Feature: Test E2E functionality of the login

  Background: 
    Given user is on the main page

  @test1
  Scenario: Successful Login
  	When user clicks on the [-enroll-] link
    When user clicks on [-Log in with Tyket-]
    Then user is directed to the QR LOGIN PAGE
    And user clicks on [-LOG IN ANOTHER WAY INSTEAD-]
    Then user is directed to the LOGIN PAGE
    When user enters Email address
    When user enters password
    And user clicks clicks on [-LOGIN-] button
    Then user successfully logs in
    Then user should click on MyBusiness

  @test2
  Scenario: Watch video link test
    When user clicks on [-Watch Video-]
    Then video should play

  @test3
  Scenario: LogIn button test
    When user clicks on [-TOP LOGIN BUTTON (door)-]
    Then user should be on https://tykbroker.com/qr
  
	