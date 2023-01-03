$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Bistobites.feature");
formatter.feature({
  "name": "To order food in the Bisto bites application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature3"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "user has to enter the chromebrowser and maximize window",
  "keyword": "Background"
});
formatter.scenario({
  "name": "The user selects the Spanish Omelete",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature3"
    },
    {
      "name": "@te4"
    }
  ]
});
formatter.step({
  "name": "The user has to launching url in Bisto bites application",
  "keyword": "When "
});
formatter.match({
  "location": "Automationsamplebites.the_user_has_to_launching_url_in_Bisto_bites_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to Click the search icon1",
  "keyword": "And "
});
formatter.match({
  "location": "Automationsamplebites.the_user_has_to_Click_the_search_icon(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user Find out the Spanish Omelet and Click the icon",
  "keyword": "And "
});
formatter.match({
  "location": "Automationsamplebites.the_user_Find_out_the_Spanish_Omelet_and_Click_the_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the dollar",
  "keyword": "And "
});
formatter.match({
  "location": "Automationsamplebites.check_the_dollar()"
});
formatter.result({
  "status": "passed"
});
});