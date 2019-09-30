$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Techfios/Spring2019/Driver/BackgroundColorWhite/src/test/java/features/whitebackground.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i want to click on set White background button so that i can change the backgound color to white",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-white-background-button-so-that-i-can-change-the-backgound-color-to-white",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "White Background Change",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-white-background-button-so-that-i-can-change-the-backgound-color-to-white;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Set white Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on the white button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 8635466900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_button()"
});
formatter.result({
  "duration": 162276300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 73534200,
  "status": "passed"
});
});