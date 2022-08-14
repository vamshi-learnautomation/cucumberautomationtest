Feature: Add products to cart

@Smoketest
Scenario: Adding products and check in cart

Given user is on landing page of the application
When user search item with shortname "Cau" in the search box 
And searched item added to cart
Then item "Cau" added are displayed in the cart

@Smoketest
Scenario Outline: Adding products and verify total amount from cart
Given user is on landing page of the application
When user search item with shortname "Cau" in the search box 
And increase the <quantity> of items added
And searched item added to cart
Then item "Cau" added are displayed in the cart
And total cart value displayed in the cart 

Examples:
|quantity|
|3|