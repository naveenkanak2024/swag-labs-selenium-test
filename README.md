# swag-labs-selenium-test

# Adding Highest Price Item to the Cart

## Background: Logging in to Sauce Demo as Standard User
- **Given** I am on the Sauce Demo login page
- **When** I enter the username as "standard_user"
- **And** I enter the password as "secret_sauce"
- **And** I click on the login button

## Scenario: Adding Highest Price Item to the Cart
- **Given** I am on the products page
- **When** I click on the "ADD TO CART" button corresponding to the highest priced item
- **And** I click on the cart icon
- **Then** I should see the product successfully added

<img width="1509" alt="image" src="https://github.com/naveenkanak2024/swag-labs-selenium-test/assets/164809276/0089ae4e-2354-48d3-a2ca-243160981682">
