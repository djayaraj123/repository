package common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserCommands {

	public static RemoteWebDriver driver=null;
	
	static Logger logger = Logger.getLogger(BrowserCommands.class);
	
	public void launchChromeBrowser() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayaraj.D\\Documents\\test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	public void type(WebElement ele,String input) {
		ele.sendKeys(input);
		logger.info("Element typed successfully");
	}
	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}
}
