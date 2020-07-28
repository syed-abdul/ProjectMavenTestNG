package org.read;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends 	Utility {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	
	
		
		@FindBy(id="email")
		private WebElement user;
		@FindBy(id="pass")
		private WebElement pass;
		@FindBy(id="loginbutton")
		private WebElement btn;
		public WebElement getUser() {
			return user;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getBtn() {
			return btn;
		}
		
	


}