Feature: Adding highest price item to the cart

 Background: Logging in to sauce demo as standard user
   Given I am on the sauce demo login page
   When I enter the username as "standard_user"
   And I enter the password as "secret_sauce"
   And I click on login button

  Scenario: Adding highest price item to the cart
    Given I am on the products page
    When I click on "ADD TO CART" button corresponding highest price
    And I click on cart icon
    Then I should see the product successfully added