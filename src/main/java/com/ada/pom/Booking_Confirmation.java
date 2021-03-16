package com.ada.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public static WebDriver driver;
	
	@FindBy(name = "search_hotel")
	private WebElement searchHotel;
	
	@FindBy(id ="my_itinerary")
	private WebElement myItinerary;
	
	@FindBy(name = "logout")
	private WebElement logout;

	public Booking_Confirmation(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

}
