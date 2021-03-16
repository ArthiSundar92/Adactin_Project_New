Feature: Hotel Booking In Adactin Application 




@Smoketest 
Scenario Outline:

	Given user Launch The Application 
	When user Enter The "<Username>" In Username Field 
	And user Enter The "<Password>" In Password Field 
	Then user Click On The Login Button And It Navigates To The Search Hotel Page 
	
	Examples:
	
	|Username|Password|
	|Durga|1258A|
	|SundarAarthi|123456|
	
	
	
	
@Smoketest 
Scenario: Search Hotel Functionality 

	When user Select The Location In Location Field 
	And user Select The Hotels In Hotel Field 
	And user Select The RoomType In RoomType Field 
	And user Select The NumberOf Room In NumberOfRoom Field 
	And user Enter The CheckInDate In CheckInDate Field 
	And user Enter The CheckOutDate In CheckOutDate Field 
	And user Select The AdultsPerRoom In AdultsPerRoom Field 
	And user Select The ChildrenPerRoom In ChildrenPerRoom Field 
	Then user Click On The Search Button And It Navigates To The Select Hotel Page 
	
@Sanitytest 
Scenario: Select Hotel Functionality 

	When user Click On The Radio Button 
	Then user Click On The Continue Button And It Navigates To The Book A Hotel Page 
	
@Sanitytest 
Scenario: Book A Hotel Functionality 

	When user Enter The  FirstName In The FirstName Field 
	And user Enter The LastName In The LastName Field 
	And user Enter The Billing Address In The Billing Address Field 
	And user Enter The Credit Card Number In The Credit Card Number Field 
	And user Select The Credit Card Type In The Credit Card Type Field 
	And user Select The Expiry Date For Month In The Select Month Field 
	And user Select The Expiry Date For Year In The Select Year Field 
	And user Enter The CVV Number In The CVV Number Field 
	Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page 
	
@Sanitytest 
Scenario: Booking Confirmation Functionality 

	When user Click On The My Itinerary And It Navigates To The Book Itinerary Page 
	
@Regressiontest 
Scenario: Book Itinerary Functionality 

	When user Click On The LogOut Button 
	
	
	
