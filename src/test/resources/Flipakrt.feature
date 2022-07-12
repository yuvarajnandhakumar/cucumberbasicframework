
@loginfeature
Feature: Flipkart automation
used to auotmate flipkart modules
Background:
Given enter some basic fun for all scenario

@login1
Scenario: Login simpleformat
#step decalration
#Gherkin format
#own launguage- english
Given launch a browser
Then user enter username "yuvarj"
And user enter password "45678ghj!@#"
Then user clicks on login button
When user validates the login screen with userid or username
Then user goes to search page


@login2
Scenario: Login onedimlistmap
Given launch a browser
Then user enter username for onedimlist
|yuvarj|prabhu|saravanan|
And user enter password onedimmap
|pwd1|45678ghj!@#|
|pwd2|345674567$%|
|pwd3|dsfds@#$%234|
Then user clicks on login button
When user validates the login screen with userid or username


@login3
Scenario Outline: Login Scenario outline
Given launch a browser
Then user enter username "<username>"
And user enter password "<password>"
Then user clicks on login button
When user validates the login screen with userid or username
Examples:
|username|password|
|yuvraj|678hjk|
|divya|87657hgh|
|saravanan|8456789|
