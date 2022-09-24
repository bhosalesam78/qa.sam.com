package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import TestBase.Testbase;
import Utility.Utils;

public class HomePages extends Testbase {

	@FindBy (xpath="//a[text()='LOGIN / REGISTER']") private WebElement signin;
	@FindBy (xpath="//input[@id='txtUserID']") private WebElement username;
	@FindBy (xpath="//input[@id='txtTradingPassword']") private WebElement pass;
	@FindBy (xpath="//a[@id='loginBtn']") private WebElement loginbtn;
	//@FindBy (xpath="") private WebElement Login;
	@FindBy (xpath="//button[@id='tabclose']") private WebElement popup;

public HomePages(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void signupbtn() {	
	signin.click();
}
public void verifyHomepageUsername(String un) throws IOException{
Assert.assertTrue(username.isDisplayed(), "Signin not displayed");
Reporter.log("username",true);
username.sendKeys(un);
Utils.getscreenshot(driver,un);
}
public void verifyHomepagePass(String ps) {
Assert.assertTrue(pass.isDisplayed(), "Signin not displayed");
pass.sendKeys(ps);

}
public void verifyHomepageLoginBtn() {
	
 Actions action=new Actions(driver);
 action.click(loginbtn).build().perform();

//loginbtn.click();
}
public void popupclose() {
	 popup.click();

}


}

