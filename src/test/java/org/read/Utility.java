package org.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Utility {
	static WebDriver driver;
	public static void launchApp(String s) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\div\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(s);
		
	}
	public static  void title() {
		System.out.println(driver.getTitle());
	}
	public static void url() {
		System.out.println(driver.getCurrentUrl());
	}
	public static  void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void clk(WebElement w) {
		w.click();
	}
	

}
