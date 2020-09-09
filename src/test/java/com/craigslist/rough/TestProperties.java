package com.craigslist.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.craigslist.base.TestBase;

public class TestProperties extends TestBase {

		public static void main(String[] args) throws IOException {
			
			Properties config = new Properties();
			FileInputStream fisConfig = new FileInputStream(projectPath +"\\src\\test\\resources\\properties\\Config.properties");
			config.load(fisConfig);
			
			Properties OR = new Properties();
			FileInputStream fisOR = new FileInputStream(projectPath +"\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fisOR);
		}
	}


