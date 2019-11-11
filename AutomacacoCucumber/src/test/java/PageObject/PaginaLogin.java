package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLogin {
		
	private WebDriver driver;
		      
		 public PaginaLogin(WebDriver driver) {
				this.driver = driver;
			}
		 
		 private WebElement Email; 
		 private WebElement ButtonLogin;
		 private WebElement Password;
		 
		
		 public void Login(String email, String password)
		 {
		    Email.sendKeys(email);
		    Password.sendKeys(password);
		    ButtonLogin.click(); 
		 }
}