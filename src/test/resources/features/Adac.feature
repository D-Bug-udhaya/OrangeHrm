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

	