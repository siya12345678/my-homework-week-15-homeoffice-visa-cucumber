Feature: Visa Confirmation Test
  As a user i am on home office page and  want to do visa confirmation for uk from different countries
@Smoke @Regression
  Scenario: Australian user can come to uk for tourism
    Given I am on home office page
    When I click on start button
    And I select nationality "Australia"
    And I click on continue button
    And I select reason to come is "Tourism"
    And I click on continue buttonAgain
    Then I should verify message successfully
  @Sanity @Regression
  Scenario: Chilean user can come to uk for work and plans on stay for longer then six month
    Given I am on home office page
    When I click on start button
    And I select nationality "Chile"
    And I click on continue button
    And I select reason to come is "Work,academic visit or business"
    And I click on continue buttonAgain
    And I select length of stay "Longer Then 6 month"
    And I click on duration page continue button
    And I select planning to work for "Health and care professional"
    And I click on continue button on work for page
    #Then I should verify "You need a visa to work in health and care" message
  @Regression
  Scenario: Columbian user can come to uk to join partner for long stay
    Given I am on home office page
    When I click on start button
    And I select nationality "Colombia"
    And I click on continue button
    And I select reason to come is "Join partner or family for a long stay"
    And I click on continue buttonAgain
    And I click on "Yes" option that my partners family member have uk immigration
    And I click on continue button after selecting yes option
    And I should verify "You’ll need a visa to join your family or partner in the UK" message





