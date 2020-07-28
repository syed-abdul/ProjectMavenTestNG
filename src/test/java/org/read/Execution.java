package org.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Execution extends Utility{
	
	
			
		
	
	
	@Parameters({"username","password"})
	@Test
	public  void test(String s1,String s2) {
		
		
		
		launchApp("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		LoginPage l=new LoginPage();
		title();
		url();
		fill(l.getUser(),s1);
		fill(l.getPass(),s2);
		clk(l.getBtn());
		
	}
}	

	

//	public static void main(String[] args) {
//		
//		launchApp("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		LoginPage l=new LoginPage();
//		title();
//		url();
//		
//		fill(l.getUser(),);
//		fill(l.getPass(), );
//		clk(l.getBtn());
//		
		
		
		
		
		
		
		
	
	





