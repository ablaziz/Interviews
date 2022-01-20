Feature: Chek functionality of Amazon
  @wip
  Scenario: Find product and try to sell it without registration
    Given User on the home page and search for "fish oil 1000mg omega-3"
    When User click on the "Dr. Tobias Omega 3 Fish Oil – Triple Strength Dietary Nutritional Supplement – Helps Support Brain & Heart Health, Includes EPA & DHA – 2000 mg per Serving,180 Soft Gel Capsules"
    And User click on button Sell on Amazon
    Then User go to Log in Page