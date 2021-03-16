package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ada.baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();

		getUrl(url);

		Thread.sleep(2000);

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {

		String username = FileReaderManager.getInstance().getInstanceCR().getUsername();

		inputValueElement(pom.get_InstanceLogin().getUsername(), username);
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();

		inputValueElement(pom.get_InstanceLogin().getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.get_InstanceLogin().getLogin());

		wait(200);

	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getLocation(), "value", "Sydney");

	}

	@When("^user Select The Hotels In Hotel Field$")
	public void user_Select_The_Hotels_In_Hotel_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getHotels(), "value", "Hotel Creek");

	}

	@When("^user Select The RoomType In RoomType Field$")
	public void user_Select_The_RoomType_In_RoomType_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getRoomType(), "value", "Standard");
	}

	@When("^user Select The NumberOf Room In NumberOfRoom Field$")
	public void user_Select_The_NumberOf_Room_In_NumberOfRoom_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getNumberOfRooms(), "value", "2");

	}

	@When("^user Enter The CheckInDate In CheckInDate Field$")
	public void user_Enter_The_CheckInDate_In_CheckInDate_Field() throws Throwable {

		inputValueElement(pom.get_InstanceSearchHotel().getCheckInDate(), "17/03/2021");

	}

	@When("^user Enter The CheckOutDate In CheckOutDate Field$")
	public void user_Enter_The_CheckOutDate_In_CheckOutDate_Field() throws Throwable {

		inputValueElement(pom.get_InstanceSearchHotel().getCheckOutDate(), "20/03/2021");

	}

	@When("^user Select The AdultsPerRoom In AdultsPerRoom Field$")
	public void user_Select_The_AdultsPerRoom_In_AdultsPerRoom_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getAdults(), "value", "1");

	}

	@When("^user Select The ChildrenPerRoom In ChildrenPerRoom Field$")
	public void user_Select_The_ChildrenPerRoom_In_ChildrenPerRoom_Field() throws Throwable {

		dropDown(pom.get_InstanceSearchHotel().getChild(), "value", "1");

	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.get_InstanceSearchHotel().getSearch());

		Thread.sleep(200);

	}
}
