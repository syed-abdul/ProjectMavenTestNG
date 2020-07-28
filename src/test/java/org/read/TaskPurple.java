package org.read;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPurple {
	
	@Test
	public void purple() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ragavboom\\eclipse-workspace\\MavenUseTestNg\\div1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://purple.com");
		driver.manage().window().maximize();
		WebElement mat = driver.findElement(By.xpath("(//a[text()='Mattresses'])[1]"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(mat).perform();
		WebElement pm = driver.findElement(By.xpath("(//img[@alt='The Purple Mattress'])[1]"));
		String name = pm.getText();
		System.out.println(name);
	    pm.click();
	    Thread.sleep(3000);
	    
	  driver.findElement(By.xpath("//span[@class='text']")).click();
	   
	    WebElement mattress = driver.findElement(By.xpath("//span[text()='The Purple Mattress']"));
	
	    String text = mattress.getText();
	    System.out.println(text);
	    	
	    	Assert.assertEquals(name, text);
	    
	 }

}
