@feature2

Feature: To validate the sign in of Redbus application

Background:To launch the Chromebrowser and maximize window 

Scenario: To validate the login with valid usernamew and invalid password
When To launch the url of the Redbus application 
And  user has to click  the signin button
And user has to valid phoneno

Scenario Outline: To validate the signup with valid username and invalid password
When To launch the url of the Redbus application 
And  user has to click  the signup button
And user has to valid phoneno "<phoneno>"in phono field
Examples:
|phoneno|
|7648273492|
|3764528393|