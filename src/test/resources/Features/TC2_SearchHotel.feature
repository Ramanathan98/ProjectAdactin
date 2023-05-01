@SearchHotel
Feature: Verifying Adactin search hotel details

  Scenario Outline: Verifying Adactin search hotel page with all fields to navigate to select page
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin search hotel page with mandatory fields to navigate to select page
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using mandatory fields "<location>","<noOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"

    Examples: 
      | username | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | kramtest | test1234 | Sydney   | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     |

  Scenario Outline: Verifying Adactin search hotel page by date checking
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search with the date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/12/2023  | 03/12/2022   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin search hotel page without entering any fields
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User should click search without entering any fields
    Then User should verify after search with the error message "Please Select a Location"

    Examples: 
      | username | password |
      | kramtest | test1234 |
