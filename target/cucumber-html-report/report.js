$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Test smoke scenarios of application",
  "description": "",
  "id": "test-smoke-scenarios-of-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15076772273,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "Download PDF File",
  "description": "",
  "id": "test-smoke-scenarios-of-application;download-pdf-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 74,
      "name": "@SEL"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "Login into application",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "Click on My Account link",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "Click on Order History and details",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Click on PDF link",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Download  the file using autoit",
  "keyword": "Then "
});
formatter.match({
  "location": "ShareProductOnSocialMedia.login_into_application()"
});
formatter.result({
  "duration": 6117166122,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadScenario.click_on_My_Account_link()"
});
formatter.result({
  "duration": 6839085338,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadScenario.click_on_Order_History_and_details()"
});
formatter.result({
  "duration": 8432418866,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadScenario.click_on_PDF_link()"
});
formatter.result({
  "duration": 5306807408,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadScenario.download_the_file_using_autoit()"
});
formatter.result({
  "duration": 6181035729,
  "status": "passed"
});
formatter.after({
  "duration": 5775682683,
  "status": "passed"
});
});