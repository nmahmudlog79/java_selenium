Feature: Amazon user should signIn/ Login on application or Amazon Login functionality check

  Narration:
  User can signIn when they are visiting amazon page for shopping purpose and
  they can sigIn during checkout time as well

  Background:
    Given user on amazon Sign-In page


  #@RegressionTest @SmokeTest
  @mahmud
  Scenario: Amazon login signIn functionality checking using valid credential
   # Given user on amazon Sign-In page
    And user enter valid "mh.shahib@gmail.com" email address or phone number in username field
    And user click on continue button
    And user enter valid password in password Field
    When user click on Sign-In button
    And user should be able to see the valid "Hello,Mahmudul" user name
#    Then user should be able to log in their account
#    And user should be able to see welcome message on top of Account & list

  @mahmud
  Scenario: Amazon login signIn functionality checking using valid credential
    Given user on amazon Sign-In page
    And user enter valid "lounas@gmail.com" email address or phone number in username field
    And user click on continue button
    And user enter valid password in password Field
    When user click on Sign-In button
    And user should be able to see the valid "Hello,Lounas" user name

#  @pending
#  Scenario: Amazon login/ signIn functionality checking using valid credential
#    Given user on amazon Sign-In page
#    And user enter valid email address or phone number in username field
#    And user click on continue button
#    And user enter valid password in password Field
#    When user click on Sign-In button


#
#  Scenario: Amazon login functionality checking using Invalid credential
##    Given user on amazon Sign-In page
#    And user enter Invalid email address/phone number in username field
#    When user click on continue button
#    Then user should be able to see the Error message "There was a problem We cannot find an account with that email address"
#
#  Scenario: Amazon login functionality checking using valid user name and Invalid password
##    Given user on amazon Sign-In page
#    And user enter valid email address/phone number in username field
#    And user click on continue button
#    And user enter Invalid password in password Field
#    When user click on Sign-In button
#    Then user should be able to see the Error message "There was a problem Your password is incorrect"
#





