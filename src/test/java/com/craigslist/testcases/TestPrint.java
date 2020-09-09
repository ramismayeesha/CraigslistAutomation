package com.craigslist.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.craigslist.base.TestBase;

public class TestPrint extends TestBase {

	@Test
	public static void test() throws InterruptedException	{
		clickBy(By.linkText("craigslist"));
		clickBy(By.linkText("craigslist"));
		//clickBy(By.xpath(".//a[@href='https://www.craigslist.org/about/sites']"));
		clickBy(By.linkText("US"));
		clickBy(By.linkText("dallas / fort worth"));
		clickBy(By.xpath("//a[@class='cps']//span[@class='txt'][contains(text(),'computer')]"));
		Thread.sleep(3000);
		
	}
	
}
	
