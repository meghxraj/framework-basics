package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	WebDriver driver;
	
	//creating a constructor to initilize the wedriver instance and pagefactory 
	public FacebookLogin(WebDriver driver) {
		this.driver=driver;
		
		//initilize the page factory having args as driver and local instance(this)
		PageFactory.initElements(driver, this);
	}
	
	//simplified version of POM is using Page object factory
	//we use annotation @FindBy to define the objects 
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	
	//creating methods to return the driver objects
	public WebElement email() {
		return email;
	}
	
	public WebElement pass() {
		return pass;
	}
	
	public WebElement login() {
		return login;
	}

}
