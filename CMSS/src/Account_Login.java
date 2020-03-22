import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Account_Login {
	
	@FindBy(xpath="//*[@class='login']")
	WebElement signin;
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailaddress;
	@FindBy(xpath="//button[@name='SubmitCreate']")
	WebElement accountclick;
	@FindBy(xpath="//div[@id='uniform-id_gender2']")
	WebElement RadioBTN; 
	@FindBy(xpath=".//*[@id='customer_firstname']")
	WebElement firstname;  
	@FindBy(xpath=".//*[@id='customer_lastname']")
	WebElement lastname;  
	@FindBy(xpath=".//*[@id='email']")
	WebElement clear_emailaddress;  
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;  
	@FindBy(xpath="//input[@id='firstname']")
	WebElement First_name;  
	@FindBy(xpath="//input[@id='lastname']")
	WebElement Last_name;  
	@FindBy(xpath="//input[@id='company']")
	WebElement Company;  
	@FindBy(xpath="//input[@id='address1']")
	WebElement Address; 
	@FindBy(xpath="//input[@id='city']")
	WebElement City; 
	@FindBy(xpath="//input[@id='postcode']")
	WebElement zipcode; 
	@FindBy(xpath=".//*[@id='phone_mobile']")
	WebElement Mobile_phone; 
	@FindBy(xpath=".//*[@id='alias']")
	WebElement Alais_address; 
	@FindBy(xpath="//button[@type='submit']")
	WebElement Register; 
	 
	 
		public Account_Login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void User_Registartion(WebDriver driver) {
		{ 
			
		}
		driver.get("http://automationpractice.com/index.php");
 
		 
		signin.click();
		emailaddress.sendKeys("swethakamatam12345@gmail.com");
		accountclick.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RadioBTN.click();
        System.out.println("User Registration ");

		firstname.sendKeys("Swetha");
		lastname.sendKeys("Kamat");
		clear_emailaddress.clear();
		clear_emailaddress.sendKeys("swethakamatam123456@gmail.com");
		password.sendKeys("Fusionkeys@123");
		Select dropdown_day = new Select(driver.findElement(By.name("days")));
		dropdown_day.selectByIndex(5);
		Select dropdown_month = new Select(
				driver.findElement(By.name("months")));
		dropdown_month.selectByIndex(3);
		Select dropdown_year = new Select(driver.findElement(By
				.xpath(".//*[@id='years']")));
		dropdown_year.selectByValue("1991");

		First_name.sendKeys("Swetha");
		Last_name.sendKeys("Kamat");
		Company.sendKeys("Celltick Mobile Media Services");
		Address.sendKeys("Century Bazar, Pobox46001, Celltick");
		City.sendKeys("Alexandria");
		Select dropdown_State = new Select(driver.findElement(By
				.name("id_state")));
		dropdown_State.selectByIndex(13);
		zipcode.sendKeys("46001");
		Select dropdown_Country = new Select(driver.findElement(By
				.name("id_country")));
		dropdown_Country.selectByValue("21");
		Mobile_phone.sendKeys("9967115458");		 
		Alais_address.sendKeys("Century Bazar, Pobox46001");
		Register.click();        
		System.out.println("Resistration completed. ");

	}

}
