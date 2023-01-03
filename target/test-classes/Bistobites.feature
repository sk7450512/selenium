@Feature3

Feature: To order food in the Bisto bites application 

Background:
user has to enter the chromebrowser and maximize window

@te1
Scenario: The user gives the invalid User name and password
When  The user has to launching url in Bisto bites application
And User click the “Account” button
And User has to pass the invalid username
And User has to pass the invalid password


@te2
Scenario: The User successfully add the Dosa
When  The user has to launching url in Bisto bites application
And  The user has to Click the search button
And The user has to search the Masala dosa
#And The user scroll in to down to view the dosa
And The user to select the Masala Dosa option

@test
Scenario: The user fills out the registration form and ignores the confirm password.
When  The user has to launching url in Bisto bites application
And The user to click the Account button
And The user scroll into down to view name field
And The user has to pass the name in name field
And the user has to pass the Email in Email field
And The  user has to pass the phone in phone field
And The  user has to pass the password field in password field
And The user  has to  pass the confirm password field in confirm password
And user has to click the register button
And user has seeing the popup print the popup


Scenario: The user search for the Coke can and check the price
When  The user has to launching url in Bisto bites application
And The user has to Click the search 
And The user has to search the Coke
And The user has to  check the can dollar is $ 1.50


@te4
Scenario: The user selects the Spanish Omelete
When  The user has to launching url in Bisto bites application
And The user has to Click the search icon1
And The user Find out the Spanish Omelet and Click the icon
And check the dollar 

@feature
Scenario: The user read Our Story
When  The user has to launching url in Bisto bites application
And The user has to Click the Our Story option
And Check the spelling mistake
Then The user has to close the browser