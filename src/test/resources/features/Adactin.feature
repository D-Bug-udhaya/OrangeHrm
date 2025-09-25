Feature: Adactin Hotel Booking

Scenario Outline: Login with multiple users
  Given user launches the Adactin hotel application
  And user logs in with username "<username>" and password "<password>"

	Examples:
  		| username   | password   |
 		| Udhaya9999 | U21@dhaya  |
  		| Udhaya9999 | U21@dhaya  |

  @Search
  Scenario Outline: Search for a hotel
    When user selects location "<location>", hotel "<hotelName>", room type "<roomType>", number of rooms "<numRooms>"
    And user selects check-in date "<checkIn>" and check-out date "<checkOut>"
    And user enters adults per room "<adults>" and children per room "<children>"
    Then user should see available hotels list
Examples:
|checkIn|checkOut|
|15/09/2025|20/09/2025|
  
  @Book
  Scenario Outline: Book a hotel
    Given user has searched and selected a hotel
    When user books the hotel with first name "<firstName>", last name "<lastName>", billing address "<billingAddr>", credit card number "<ccNum>", credit card type "<ccType>", expiry month "<expMonth>", expiry year "<expYear>", CVV "<cvv>"
    Then booking should be successful with order id generated

    Examples:
      | firstName | lastName | billingAddr     | ccNum                 | ccType  | expMonth | expYear | cvv  |
      | John      | Doe      | 123 Street, City | 4111111111111111      | VISA    | January  | 2025    | 123  |
      | Alice     | Smith    | 456 Avenue, City | 5500000000000004      | MasterCard | March | 2026    | 456  |