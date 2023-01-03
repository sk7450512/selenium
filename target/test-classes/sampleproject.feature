@feature1
Feature: To validate the login funtionality of ICIC Bank appilcation 

Scenario: To validate login  with valid username and valid password
Given   To launch the Chrome browser and maximize window
When To launch url of the icic bank application
And  User has to click the login button
And   User has to pass the username in userid field
And  User has to pass the password in password field
Then user close the browser
