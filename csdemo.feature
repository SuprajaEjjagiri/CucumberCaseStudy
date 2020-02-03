Feature: TestMeApp

  Background: 
    Given User executive login

  @Datadriven
  Scenario Outline: Registration for TestmeApp
    Given User is at signup for testmeApp
    When User provides "<username>"
    Then User provides "<firstname>" , "<lastname>" , "<password>" , "<confirmpassword>"
    And User continues to provides "<gender>" , "<email>" , "<mobileno>" , "<dob>" , "<address>" , "<secque>" , "<answer>"
    Then registration is successful

    Examples: 
      | username | firstname | lastname | password | confirmpassword | gender | email          | mobileno   | dob        | address   | secque                 | answer |
      | H20922T6 | user      | testing  | user123  | user123         | female | user@gmail.com | 1234567886 | 01/30/1997 | Hyderabad | What is your Pet Name? | sonu   |

  @FunctionalTest
  Scenario Outline: Login
    When User executive provides "<username>" and "<password>" as credentials
    Then Login is successful

    Examples: 
      | username | password    |
      | Lalitha  | password123 |

  @SmokeTest
  Scenario: Search for product
    Given User searches for products in the search field
      | Head |
    Then User verifies the product availability

  @RegressionTest
  Scenario: The one where the user moves to the cart without adding any item in it
    Given User proceeds to payment without adding any item in the cart
    Then TestMeApp doesnot display the cart icon
    When User proceeds to payment with adding any item to the cart
    Then TestMeApp displays cart icon
