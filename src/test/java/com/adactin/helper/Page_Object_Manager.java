package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.adactin.Book_A_Hotel;
import com.automation.adactin.Book_Itinerary;
import com.automation.adactin.Booking_Confirmation;
import com.automation.adactin.Login_Page;
import com.automation.adactin.Search_Hotel;
import com.automation.adactin.Select_Hotel;

public class Page_Object_Manager {
	
public WebDriver driver;
	
	private Login_Page l;
	
	private Search_Hotel s;
	
	private Select_Hotel sh ;
	
	private Book_A_Hotel b ;
	
	private Booking_Confirmation bc ;
	
	private Book_Itinerary bi;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public Login_Page get_InstanceLogin() {
		
		l = new Login_Page(driver);
		
		return l;
		
	}
	
	public Search_Hotel get_InstanceSearchHotel() {
		
		s = new Search_Hotel(driver);
		
		return s;

	}
	
	
	public Select_Hotel get_InstanceSelectHotel() {
		
		sh = new Select_Hotel(driver);
		
		return sh;

	}
	
	public Book_A_Hotel get_InstanceBookAHotel() {
		
		b = new Book_A_Hotel(driver);
		
		return b;

	}
	
	
	public  Booking_Confirmation get_InstanceBookingConfirmation() {
		
		 bc = new Booking_Confirmation(driver);
		 
		 return bc;

	}
	
	
	public Book_Itinerary get_InstanceBookItinerary() {
		
		bi = new Book_Itinerary(driver); 
		
		return bi;

	}
	



}
