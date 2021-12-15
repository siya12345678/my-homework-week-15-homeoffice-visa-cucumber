$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visaconfirmationtest.feature");
formatter.feature({
  "line": 1,
  "name": "Visa Confirmation Test",
  "description": "As a user i am on home office page and  want to do visa confirmation for uk from different countries",
  "id": "visa-confirmation-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3461809500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Australian user can come to uk for tourism",
  "description": "",
  "id": "visa-confirmation-test;australian-user-can-come-to-uk-for-tourism",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home office page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select nationality \"Australia\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select reason to come is \"Tourism\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on continue buttonAgain",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should verify message successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "VisaConfirmationSteps.iAmOnHomeOfficePage()"
});
formatter.result({
  "duration": 97897400,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnStartButton()"
});
formatter.result({
  "duration": 315344000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationSteps.iSelectNationality(String)"
});
formatter.result({
  "duration": 128139500,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 224758100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tourism",
      "offset": 28
    }
  ],
  "location": "VisaConfirmationSteps.iSelectReasonToComeIs(String)"
});
formatter.result({
  "duration": 61381600,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButtonAgain()"
});
formatter.result({
  "duration": 255181300,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iShouldVerifyMessageSuccessfully()"
});
formatter.result({
  "duration": 41879800,
  "status": "passed"
});
formatter.after({
  "duration": 632679300,
  "status": "passed"
});
formatter.before({
  "duration": 1955116300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Chilean user can come to uk for work and plans on stay for longer then six month",
  "description": "",
  "id": "visa-confirmation-test;chilean-user-can-come-to-uk-for-work-and-plans-on-stay-for-longer-then-six-month",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Sanity"
    },
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on home office page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I select nationality \"Chile\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select reason to come is \"Work,academic visit or business\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on continue buttonAgain",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select length of stay \"Longer Then 6 month\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on duration page continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select planning to work for \"Health and care professional\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on continue button on work for page",
  "keyword": "And "
});
formatter.match({
  "location": "VisaConfirmationSteps.iAmOnHomeOfficePage()"
});
formatter.result({
  "duration": 19100,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnStartButton()"
});
formatter.result({
  "duration": 386613100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chile",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationSteps.iSelectNationality(String)"
});
formatter.result({
  "duration": 118891100,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 190695000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Work,academic visit or business",
      "offset": 28
    }
  ],
  "location": "VisaConfirmationSteps.iSelectReasonToComeIs(String)"
});
formatter.result({
  "duration": 1564800,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButtonAgain()"
});
formatter.result({
  "duration": 129418100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Longer Then 6 month",
      "offset": 25
    }
  ],
  "location": "VisaConfirmationSteps.iSelectLengthOfStay(String)"
});
formatter.result({
  "duration": 2910200,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnDurationPageContinueButton()"
});
formatter.result({
  "duration": 116964000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health and care professional",
      "offset": 31
    }
  ],
  "location": "VisaConfirmationSteps.iSelectPlanningToWorkFor(String)"
});
formatter.result({
  "duration": 54049300,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButtonOnWorkForPage()"
});
formatter.result({
  "duration": 243131900,
  "status": "passed"
});
formatter.after({
  "duration": 627235200,
  "status": "passed"
});
formatter.before({
  "duration": 2043826800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "#Then I should verify \"You need a visa to work in health and care\" message"
    }
  ],
  "line": 26,
  "name": "Columbian user can come to uk to join partner for long stay",
  "description": "",
  "id": "visa-confirmation-test;columbian-user-can-come-to-uk-to-join-partner-for-long-stay",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I am on home office page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I select nationality \"Colombia\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select reason to come is \"Join partner or family for a long stay\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on continue buttonAgain",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on \"Yes\" option that my partners family member have uk immigration",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on continue button after selecting yes option",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I should verify \"You’ll need a visa to join your family or partner in the UK\" message",
  "keyword": "And "
});
formatter.match({
  "location": "VisaConfirmationSteps.iAmOnHomeOfficePage()"
});
formatter.result({
  "duration": 27300,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnStartButton()"
});
formatter.result({
  "duration": 325947700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Colombia",
      "offset": 22
    }
  ],
  "location": "VisaConfirmationSteps.iSelectNationality(String)"
});
formatter.result({
  "duration": 121264000,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 300396400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Join partner or family for a long stay",
      "offset": 28
    }
  ],
  "location": "VisaConfirmationSteps.iSelectReasonToComeIs(String)"
});
formatter.result({
  "duration": 63151900,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButtonAgain()"
});
formatter.result({
  "duration": 543767100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 12
    }
  ],
  "location": "VisaConfirmationSteps.iClickOnOptionThatMyPartnersFamilyMemberHaveUkImmigration(String)"
});
formatter.result({
  "duration": 57440000,
  "status": "passed"
});
formatter.match({
  "location": "VisaConfirmationSteps.iClickOnContinueButtonAfterSelectingYesOption()"
});
formatter.result({
  "duration": 212989300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You’ll need a visa to join your family or partner in the UK",
      "offset": 17
    }
  ],
  "location": "VisaConfirmationSteps.iShouldVerifyMessage(String)"
});
formatter.result({
  "duration": 39413800,
  "status": "passed"
});
formatter.after({
  "duration": 658060300,
  "status": "passed"
});
});