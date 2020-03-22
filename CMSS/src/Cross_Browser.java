import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Cross_Browser {


	static WebDriver driver;
	public static WebDriver get (String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha\\Desktop\\SELENIUM_Folders\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Swetha\\Desktop\\SELENIUM_Folders\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	
}


