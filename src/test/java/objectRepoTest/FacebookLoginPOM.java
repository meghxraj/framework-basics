package objectRepoTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.LoginPage;

public class FacebookLoginPOM {
	@Test
	public void mainTest() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://facebook.com");
		//creating object of LoginPage classto access the object and methods defined
		LoginPage lp = new LoginPage(driver);
		
		//using the object created above to drive the test
		lp.email().sendKeys("testmail@gmail.com");
		lp.pass().sendKeys("testing");
		lp.login().click();
		
	}

}
