@BookHotel
Feature: Verifying Adactin book hotel details

  Scenario Outline: Verifying Adactin book hotel page to generate order id
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    When User should select hotel and continue
    Then User should navigate to book hotel and verify the success message "Book A Hotel"
    When User needs to book a hotel using "<firstName>","<lastName>","<billingAddress>" and credit card details
      | ccardNo          | ccardType        | expMonth  | expYear | cvvNo |
      | 1232405343248854 | American Express | September |    2021 |   101 |
      | 1232405343248855 | VISA             | October   |    2020 |   202 |
      | 1232405343248856 | Master Card      | November  |    2022 |   303 |
      | 1232405343248857 | Other            | December  |    2021 |   404 |
    Then User should verify the success message "Booking Confirmation" and save order id

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         | Mahendran | D        | madurai        |

  Scenario Outline: Verifying Adactin book hotel page without entering any fields
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    When User should select hotel and continue
    Then User should navigate to book hotel and verify the success message "Book A Hotel"
    When User click book now without enter any fields
    Then User should verify with error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         |
