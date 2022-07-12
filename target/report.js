$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Flipakrt.feature");
formatter.feature({
  "name": "Flipkart automation",
  "description": "used to auotmate flipkart modules",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginfeature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "enter some basic fun for all scenario",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginCoding.enter_some_basic_fun_for_all_scenario()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login simpleformat",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginfeature"
    },
    {
      "name": "@login1"
    }
  ]
});
formatter.step({
  "name": "launch a browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginCoding.launch_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter username \"yuvarj\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginCoding.user_enter_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter password \"45678ghj!@#\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginCoding.user_enter_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginCoding.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates the login screen with userid or username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginCoding.user_validates_the_login_screen_with_userid_or_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user goes to search page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});