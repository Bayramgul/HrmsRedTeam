#Author:Bayramgul atageldiyevab@gmail.com
@UserStrory_11
Feature: Add membership
@addMembership
  Scenario: As an admin user should be able to add different memberships under qualifications
    Given user should be able to login with valid admin credentials
    And user clicks on "Admin" tab on Dashboard page
    And user clicks on Qualifications and "Membership" dropdown and clicks on addBtn
    
    When user enters different Membership and clicks on saveBtn and Validate membership in dataTable
    |NOVA Softwar |DC Agil|Java User|
   
