Feature: Product Details will house all tests pertaining to a products details page

  Background: launch the browser
    Given I launch the browser

  @amazon
Scenario: Verify Product Details
    Given I navigate to "https://amazon.in/"
    When I navigate to Televisions
    And I add a filter to my search by brand
    And I sort the results by High to Low
    And I select the second TV
    Then I verify the product description
    And I close the browser
