package objectRepoTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.FacebookLogin;

public class PageFactoryExample {
	@Test
	public void mainTest() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://facebook.com");
		// creating object of LoginPage class to access the object and methods defined
		FacebookLogin fb = new FacebookLogin(driver);
		fb.email().sendKeys("test@gmail.com");
		fb.pass().sendKeys("pass");
		fb.login().click();
	}
}
