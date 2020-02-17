$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/webtest.feature");
formatter.feature({
  "line": 1,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "1. Create a new account",
  "description": "",
  "id": "test;1.-create-a-new-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a new user to website \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user clicks signin",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "they see option to create a new account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enters the details to register",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is registered",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});