package TestBase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testbase {
public static WebDriver driver;	
public void intializeBrowser(String browser) {
			 
			 

if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambodhi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sambodhi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
		}else {
	    System.out.println("Wrong browser selected by user");
				}
		driver.get("https://trade.angelbroking.com/");
			//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

}
