package com.craigslist.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.craigslist.base.TestBase;

public class Jewelry extends TestBase{

	@Test
	public static void JewelryTiffany () throws InterruptedException {
		
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("US"));
		//clickBy(By.xpath(".//a[@href='https://www.craigslist.org/about/sites']"));
		clickBy(By.linkText("dallas / fort worth"));
		WebElement jewelryVerification = driver.findElement(By.linkText("jewelry"));
		if (jewelryVerification.isDisplayed()) {
			jewelryVerification.click();
		}
		log.debug("Jewelry is verified");
	
	sendKeysBy(By.xpath(".//input[@placeholder='search jewelry']"), "Tiffany");
	delay(2000);
	clickBy(By.xpath(".//button[@class='searchbtn changed_input clickme']"));
	delay(2000);
	sendKeysBy(By.xpath(".//input[@name='min_price']"), "200");
	delay(2000);
	sendKeysBy(By.xpath(".//input[@name='max_price']"), "500");
	clickBy(By.xpath(".//button[contains(text(),'update search')]"));
	delay(2000);
	//clickBy(By.xpath(".//a[@href='https://dallas.craigslist.org/dal/jwd/d/san-diego-u1486-diamond-ring-engagement/7184136205.html']"));
	
	}
}




