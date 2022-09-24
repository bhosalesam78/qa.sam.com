package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePages;
import TestBase.Testbase;
import Utility.Utils;

public class Login_AngelOne_TestCase extends Testbase {

	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
//    @AfterClass
//    public void close() {
//    	Testbase.driver.close();
   // }
    @Test
    public void TestCase() throws IOException {
    	
    	HomePages  H=new HomePages(driver);
    	
    	H.signupbtn();
    	
    	H.verifyHomepageUsername(Utils.getStringTestData(0, 0));
    	
    	H.verifyHomepagePass(Utils.getStringTestData(0, 1));
    	
         
    	H.verifyHomepageLoginBtn();
    	
    	H.popupclose();
    }
}
