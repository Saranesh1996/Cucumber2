@feature01

Feature: To validate the login functionality of gmail website

Scenario: To enter the valid email and invalid password
Given To launch the browser and hit the gmail url
When To enter valid email
And To click the next button
And To enter invalid password
And To click the sign in button
Then To close the browser
