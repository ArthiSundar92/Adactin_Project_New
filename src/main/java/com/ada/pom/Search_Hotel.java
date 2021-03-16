package com.ada.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(name ="location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement roomType;
	
	@FindBy(name ="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(name = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(name = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(name = "adult_room")
	private WebElement adults;
	
	@FindBy(name = "child_room")
	private WebElement child;
	
	@FindBy(name = "Submit")
	private WebElement search;

	public Search_Hotel(WebDriver driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	

}
