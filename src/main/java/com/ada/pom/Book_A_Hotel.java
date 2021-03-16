package com.ada.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(name = "first_name")
	private WebElement fName;
	
	@FindBy(name = "last_name")
	private WebElement lName;
	
	@FindBy(name = "address")
	private WebElement billingAddress;
	
	@FindBy(name = "cc_num")
	private WebElement creditCardNumber;
	
	@FindBy(name = "cc_type")
	private WebElement creditCardType;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expYear;
	
	@FindBy(xpath = "(//input[@class='reg_input'])[4]")
	private WebElement cvvNumber;
	
	@FindBy(name = "book_now")
	private WebElement bookNow;

	public Book_A_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
}
