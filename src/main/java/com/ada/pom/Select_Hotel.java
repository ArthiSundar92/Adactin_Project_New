package com.ada.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(name ="radiobutton_0")
	private WebElement radio;
	
	@FindBy(name = "continue")
	private WebElement contine;

	public Select_Hotel(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContine() {
		return contine;
	}
	
	
	
	

}
