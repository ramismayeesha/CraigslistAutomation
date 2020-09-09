package com.craigslist.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.craigslist.base.TestBase;


public class KnoxvilleVerification extends TestBase {

	@Test(dataProvider = "getData")
	public static void KnoxvilleForSale (String computerValidation) throws InterruptedException {
		clickBy(By.linkText("craigslist"));
		clickBy(By.xpath(".//a[@href='https://www.craigslist.org/about/sites']"));
		clickBy(By.linkText("US"));
		boolean knoxvilleDisplayedVerified = isDisplayed(By.linkText("knoxville"));
		if (knoxvilleDisplayedVerified == true) {
			clickBy(By.linkText("knoxville"));
			log.debug("Knoxville is Displayed");
		}
		Thread.sleep(2000);
		clickBy(By.xpath(".//a[@href='/d/for-sale/search/sss']"));
		clickBy(By.xpath(".//select[@id='subcatAbb']"));
		List <WebElement> listoptions = driver.findElements(By.xpath(".//select[@id='subcatAbb']//option")) ;
			if (listoptions.size() == 46) {
				log.debug("Verified all list items");
			}
			else {
				log.debug("Not Verified all the list items");
			}
		for(WebElement option : listoptions) {
			String optionMenu = option.getText();
			log.debug(optionMenu);
		//IF YOU WANT TO PRINT TILL YOUR SELECTED OPTION 
			if (optionMenu.contains(computerValidation)) {
				option.click();
				break;
			}
			
		}
	}
}

