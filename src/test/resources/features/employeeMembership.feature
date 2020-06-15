#Author: your.email@your.domain.com
Feature: 
@userStory12
  Scenario Outline: As an admin user should be able to add memberships to any employee
    Given user should be able to login with valid admin credentials
    And clicks on PIM and searches employee by "14327" and clicks from dataTable
    And user clicks on Memberships link and clicks on AddMembershipDetailBtn
    When user fills "<Membership>","<SubscriptionPaidBy>","<SubscriptionAmount>","<Currency>","<SubscriptionCommenceDate>","<SubscriptionRenewalDate>"
    And click on Save button
    Then I verify the Assigned Membership "RedTeam"
    Examples: 
      | Membership | SubscriptionPaidBy | SubscriptionAmount | Currency             | SubscriptionCommenceDate | SubscriptionRenewalDate |
      | RedTeam    | Company            |                100 | United States Dollar | 2020-Jun-22              | 2023-Jun-19             |
