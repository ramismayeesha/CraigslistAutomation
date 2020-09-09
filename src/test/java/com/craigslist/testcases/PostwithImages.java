package com.craigslist.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.craigslist.base.TestBase;

public class PostwithImages extends TestBase {

	@Test // annotation
	public static void postRoommateAdwithImage () throws InterruptedException, AWTException {
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("US"));
		Thread.sleep(3000);
		clickBy(By.linkText("dallas / fort worth"));
		clickBy(By.xpath(OR.getProperty("ROOM_SHARE")));
		clickBy(By.linkText(OR.getProperty("POST_BUTTON")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("AREA_RADIO_BUTTON_DALLAS")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("HOUSING_OFFERED_BUTTON")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("CATEGORY_ROOMS&SHARES_BUTTON")));
		Thread.sleep(2000);
		sendKeysBy(By.name(OR.getProperty("POSTING_TITLE")), OR.getProperty("POSTING_TITLE_BODY2") );
		Thread.sleep(2000);
		sendKeysBy(By.name(OR.getProperty("LOCATION")), OR.getProperty("LOCATION_BODY"));
		Thread.sleep(2000);
		sendKeysBy(By.id("postal_code"), "75081");
		Thread.sleep(2000);
		sendKeysBy(By.name(OR.getProperty("DESCRIPTION")), OR.getProperty("DESCRIPTION_BODY2"));
		Thread.sleep(2000);
		sendKeysBy(By.xpath(OR.getProperty("RENT_BOX")), OR.getProperty("RENT_BODY2"));
		sendKeysBy(By.xpath(OR.getProperty("SQUAREFEET_BOX")), OR.getProperty("SQUAREFEET_BODY"));
		clickBy(By.id(OR.getProperty("PRIVATE_ROOM_DROPDOWN")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("PRIVATE_ROOM_SELECTION")));
		clickBy(By.id(OR.getProperty("PRIVATE_ROOM_SELECT")));
		Thread.sleep(2000);
		clickBy(By.id(OR.getProperty("PRIVATE_BATH_DROPDOWN")));
		clickBy(By.id(OR.getProperty("LAUNDRY_DROPDOWN")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("LAUNDRY_INBLNG")));
		clickBy(By.id(OR.getProperty("PARKING_DROPDOWN")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("STREET_PARKING_SELECTION")));
		clickBy(By.name(OR.getProperty("SELECT_NOSMOKING")));
		selectDate ("2020-09-04", "4");
		Thread.sleep(2000);
	//	sendKeysBy(By.xpath(".//input[@placeholder='Your email address']"), OR.getProperty("EMAIL"));
		clickBy(By.xpath(OR.getProperty("CONTINUE_BUTTON")));
		Thread.sleep(2000);
		sendKeysBy(By.name(OR.getProperty("ADDRESS1")), OR.getProperty("ADDRESS_STREETNAME"));
		Thread.sleep(2000);
		sendKeysBy(By.name(OR.getProperty("ADDRESS2")), OR.getProperty("CROSS_STREET"));
		Thread.sleep(2000);
		sendKeysBy(By.id(OR.getProperty("CITY_NAME_SELECTION")), OR.getProperty("CITY_NAME"));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("ADDRESS_PAGE_CONTINUE_BUTTON")));
		Thread.sleep(2000);
		clickBy(By.xpath(OR.getProperty("ADD_IMAGE_BUTTON")));
		Thread.sleep(3000);
		upload("Gray stone lane.jpg");
		clickBy(By.xpath(OR.getProperty("SKIP_IMAGES")));
		//Skipped publishing the ad. 
	}
	
	public static void selectDate (String date, String dropDownSelect) {
		sendKeysBy(By.xpath(OR.getProperty("AVAILABLE_DATE_OPTION")), date);
		clickBy(By.xpath(".//td[@data-handler='selectDay']//a[contains(text(),'"+dropDownSelect+"')]"));
	}
}
