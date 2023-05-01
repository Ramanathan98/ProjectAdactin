@CancelBooking
Feature: Verifying Adactin cancel booking details

  Scenario Outline: Verifying Adactin booked itinerary page to cancel the order id
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    When User should select hotel and continue
    Then User should navigate to book hotel and verify the success message "Book A Hotel"
    When User needs to book a hotel using "<firstName>","<lastName>","<billingAddress>" and credit card details
      | ccardNo          | ccardType        | expMonth  | expYear | cvvNo |
      | 2222405343248874 | American Express | September |    2021 |   101 |
      | 2222405343248875 | VISA             | October   |    2022 |   202 |
      | 2222405343248876 | Master Card      | November  |    2020 |   303 |
      | 2222405343248877 | Other            | December  |    2020 |   404 |
    Then User should verify the success message "Booking Confirmation" and save order id
    When User should navigate to booked itinerary to cancel the order id
    Then User should verify after cancel the order id with the success message "The booking has been cancelled."

    Examples: 
      | username | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | kramtest | test1234 | Sydney   | Hotel Creek | Standard | 2 - Two   | 02/01/2023  | 03/01/2023   | 3 - Three     | 1 - One         | Mahendran | D        | madurai        |

  Scenario Outline: Verifying Adactin booked itinerary page to cancel the existing order id
    Given User is on the adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello kramtest!"
    When User should navigate to booked itinerary to cancel the existing "<orderId>"
    Then User should verify after cancel the order id with the success message "The booking has been cancelled."

    Examples: 
      | username | password | orderId    |
      | kramtest | test1234 | 65HA5NZ5RE |
