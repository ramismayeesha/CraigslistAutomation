package com.craigslist.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.craigslist.base.TestBase;

public class LongIsland extends TestBase{

	@Test
	public static void longIslandBeachHouse () throws InterruptedException {
		
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("US"));
		clickBy(By.linkText("long island"));
		delay(2000);
		WebElement vacationRentalsVerification = driver.findElement(By.linkText("vacation rentals"));
		if (vacationRentalsVerification.isDisplayed()) {
			vacationRentalsVerification.click();
			log.debug("Vacation rental is verified");
		}
		sendKeysBy(By.xpath(".//input[@placeholder='search vacation rentals']"), "Beach house");
		delay(2000);
		clickBy(By.xpath(".//button[@class='searchbtn changed_input clickme']"));
		delay(2000);
		sendKeysBy(By.xpath(".//input[@name='min_price']"), "500");
		delay(2000);
		sendKeysBy(By.xpath(".//input[@name='max_price']"), "1000");
		//clickBy(By.xpath(".//a[contains(text(),'reset')]//following::button[1]"));
		clickBy(By.xpath(".//button[@class='searchbtn changed_input clickme']"));
		delay(2000);
		log.debug("Clicked update search");
		List<WebElement> beachHousesOptions = driver.findElements(By.xpath(".//ul[@class='rows']//li//*[@class='result-title hdrlnk']"));
		// if you give * you do not need to put any speicific tag name in the xpath 
		for (WebElement list : beachHousesOptions) {
			String listMenu = list.getText();
			if (listMenu.contains("WESTHAMPTON")||listMenu.contains("West Hampton")) {
				log.debug(listMenu);
			}
		}

	}
}
