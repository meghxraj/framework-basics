package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//1. one way to define page object model
	//2. second way is define in another class
	
	WebDriver driver;
	//creating constructor be assign driver instance from test calass to local webdriver 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//identify and assign objects
	By email = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	
	//creating methods to return the driver objects
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement pass() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}

}
