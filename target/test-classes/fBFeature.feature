Feature: Adactin Hotel Booking

  Background:
    Given user launches the Adactin hotel application
    And user logs in with username "<username>" and password "<password>"

  @Search
  Scenario Outline: Search for a hotel
    When user selects location "<location>", hotel "<hotelName>", room type "<roomType>", number of rooms "<numRooms>"
    And user selects check-in date "<checkIn>" and check-out date "<checkOut>"
    And user enters adults per room "<adults>" and children per room "<children>"
    Then user should see available hotels list

    Examples:
      | username | password | location  | hotelName     | roomType | numRooms | checkIn    | checkOut   | adults | children |
      | user1    | pass1    | Sydney    | Hotel Creek   | Deluxe   | 1        | 15/10/2025 | 17/10/2025 | 2      | 0        |
      | user2    | pass2    | London    | Hotel Sunshine | Standard | 2        | 01/11/2025 | 05/11/2025 | 1      | 1        |
