Feature: Nopcommerce
  

 @Sanitytest
  Scenario: Login to Nopcommerce with valid details
  
 Given user is on the login page
And verify page title as "Your store. Login"
When user enters username and password 
And click on login button
Then verify homepage is displayed
And verify page title "Dashboard / nopCommerce administration"

 