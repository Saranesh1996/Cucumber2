Feature: To validate the login credentials in commerce website

Scenario: To pass the userName and Password field
Given To launch the browser and hit the url
When To pass the username in the userName field
And To pass the Password in the password field
And To click the login button
Then Page title should be dashboard
When To click the logout button
Then Page title back as Store login page
And close the browser


