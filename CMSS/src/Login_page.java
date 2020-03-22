
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Login_page {
	@FindBy (xpath="//a[@class='login']")
	WebElement signin;
	@FindBy (xpath=".//*[@id='email']")
	WebElement email;
	@FindBy (xpath=".//*[@id='passwd']")
	WebElement password;
	@FindBy (xpath="//button[@id='SubmitLogin']")
	WebElement submit_login;
	@FindBy (xpath="//a[@title='Women']")
	WebElement woman_section;
	@FindBy (id="quantity_wanted")
	WebElement Quantity;
	@FindBy (name="Submit")
	WebElement Submit;
	@FindBy (xpath="//a[@class='btn btn-default button button-medium']")
	WebElement proceed_checkout;
	@FindBy (xpath=".//*[@id='center_column']/p[2]/a[1]/span")
	WebElement summary;
	@FindBy (xpath="//button[@class='button btn btn-default button-medium']")
	WebElement final_address;
	@FindBy (xpath=".//*[@id='cgv']")
	WebElement checkBTNagree;
	@FindBy (xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	WebElement shipping;
	@FindBy (xpath="//a[@class='bankwire']")
	WebElement payment;
	@FindBy (xpath=".//*[@id='cart_navigation']/button")
	WebElement confirmorder;
	@FindBy (xpath="//a[@class='account']")
	WebElement myprofile;
	@FindBy (xpath=".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
	WebElement orderhistory;
	 
	 
		public Login_page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void login_details(WebDriver driver) throws InterruptedException
		{
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)							
					.withTimeout(30, TimeUnit.SECONDS) 			
					.pollingEvery(5, TimeUnit.SECONDS) 			
					.ignoring(NoSuchElementException.class);
		 
		signin.click();
        System.out.println("Login the website with Email and Password");

		email.sendKeys("swethakamatam@gmail.com");
		password.sendKeys("Fusionkeys@123");
		submit_login.click();
		Thread.sleep(100);
        System.out.println("Navigate to Women section");

		woman_section.click();
        System.out.println("Clicked Women section");
		Thread.sleep(1800);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
	    Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[2]")));   
	    System.out.println("Waiting till load all contents");
	    WebElement fadedshortssleeve=driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		//WebElement quickview_fadedshortsleeve = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[2]"));
		System.out.println("Finding quickview label on product");
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		act.moveToElement(fadedshortssleeve).moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[2]/span"))).click().build().perform();
		System.out.println("Action moveToElement to QuickView text of product");
		Thread.sleep(1800);
		
		//Switching to fancybox-Frame
	    System.out.println("Switching the fancybox-Frame"); 	    
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'fancybox-frame')]")));
	    Quantity.clear();
		Quantity.sendKeys("2");
		Thread.sleep(1800);
	    Submit.click();
		Thread.sleep(1800);
	    System.out.println("Adding Quantity and proceed to addtocard");
	    driver.switchTo().defaultContent();	 
	    Thread.sleep(1800);
	    System.out.println("switch back to defaultContent");
	    proceed_checkout.click();
	    System.out.println("Checkoutproceed");
	    summary.click();
	    System.out.println("Summaryproceed");
		final_address.click();
	    System.out.println("FinalAddress");
		checkBTNagree.click(); 
        System.out.println("Select checkBob Is T&C checkbox. ");
 		shipping.click();
        System.out.println("Atandard-Checkout ");
		payment.click();
        System.out.println("Payment ");
		Thread.sleep(1000);
		confirmorder.click();
		Thread.sleep(1000);
		myprofile.click();
		Thread.sleep(1000);
		orderhistory.click();
        System.out.println("Closing the browser ");
		Thread.sleep(1000);
		driver.close();

	}
}