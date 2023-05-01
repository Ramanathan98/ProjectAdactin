@Login
Feature: Verifying Adactin hotel login details

  Scenario Outline: Verifying Adactin hotel login valid
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"

    Examples: 
      | username | password |
      | kramtest | test1234 |

  Scenario Outline: Verifying Adactin hotel login valid using Enter
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>" with Enterkey
    Then User should verify after login success message "Hello kramtest!"

    Examples: 
      | username | password |
      | kramtest | test1234 |

  Scenario Outline: Verifying Adactin hotel login Invalid credentials
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login with invalid credentials error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | username | password    |
      | kramtest | Asdf@123456 |
