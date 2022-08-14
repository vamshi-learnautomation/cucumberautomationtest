
Feature: Homepage

Scenario: Verify Orderdetails and get email
 
 Given user is on the login page
And verify page title as "Your store. Login"
When user enters username and password 
And click on login button
Then verify homepage is displayed
 When click on sales menu
 And click on Orders
 And verify search orders button displayed