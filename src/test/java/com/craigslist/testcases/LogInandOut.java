package com.craigslist.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.craigslist.base.TestBase;

public class LogInandOut extends TestBase{

		
		@BeforeTest
		public static void login() throws InterruptedException {
			driver.navigate().to("https://accounts.craigslist.org/login/home");
			sendKeysBy(By.name(OR.getProperty("EMAIL_INPUT")), OR.getProperty("EMAIL"));
			sendKeysBy(By.name(OR.getProperty("PASSWORD_INPUT")), OR.getProperty("PASSWORD"));
			clickBy(By.id(OR.getProperty("LOGIN_BUTTON")));
			log.debug("Logged In successfully");
			}
		
		
		@AfterTest
		public static void logout() {
			driver.navigate().to("https://accounts.craigslist.org/login/home");
			clickBy(By.linkText(OR.getProperty("LOGOUT_BUTTON")));
			log.debug("Logged out successfully");
		}

	}


