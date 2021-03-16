package com.ada.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Itinerary {
	
	public static WebDriver driver;
	
	@FindBy(name = "ids[]")
	private WebElement radio;
	
	@FindBy(name = "cancelall")
	private WebElement cancelSelected;
	
	@FindBy(name = "search_hotel")
	private WebElement searchHotel;
	
	@FindBy(id = "logout")
	private WebElement logout;

	public Book_Itinerary(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
