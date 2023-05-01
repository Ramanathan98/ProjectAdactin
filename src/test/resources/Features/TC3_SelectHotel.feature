@SelectHotel
Feature: Verifying Adactin select hotel details

  Scenario Outline: Verifying Adactin select hotel page to navigate book hotel page
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    When User should select hotel and continue
    Then User should navigate to book hotel and verify the success message "Book A Hotel"

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin select hotel without select a hotel
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    When User should continue without select hotel
    Then User should verify after continue with the error message "Please Select a Hotel"

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         |
