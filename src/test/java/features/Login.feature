 Feature: Login with datatables
 @Smoketest
 Scenario: Login with Nopcommerce with datatables
 
Given user is on the new login page
When user enters Nusername and Npassword 
|Rajesh|ramesh123@|
|Rahul|rajesh12@3$|
And click on logins button
Then verify homepages is displayed

@Regressiontest 
Scenario: Login with Nopcommerce with datatables
 
Given user is on the Home page
When user Searches for some product 
And click on Search button
Then verify Search results are displayed

