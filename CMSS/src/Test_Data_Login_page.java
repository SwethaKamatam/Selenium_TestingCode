import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test_Data_Login_page {
	WebDriver driver;
	@Test
	public void Login() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Registration with user details
		Account_Login account_login=new Account_Login(driver);
		account_login.User_Registartion(driver);
		
		//Login and navigate to required steps
		Login_page login=new Login_page(driver);
		login.login_details(driver);
	}
	
	
}


