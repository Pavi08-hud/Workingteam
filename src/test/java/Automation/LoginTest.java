package Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {
	 WebDriver driver;
	    Loginpage Loginpageobj;

	    @BeforeTest
	    public void launchbrowser() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.get("https://www.sreenidhirajakrishnan.com/practice");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Loginpageobj = new Loginpage(driver);
	        Thread.sleep(5000);
	    }

	    @Test(priority=1,groups="smoke")
	    public void verifySubmitMessage() throws InterruptedException {
	    	Thread.sleep(5000);
	        Loginpageobj.selectusername("student");
	        Thread.sleep(5000);
	        Loginpageobj.clickpassword("Password123");
	        Thread.sleep(5000);
	        Loginpageobj.clicksubmit();
	        Thread.sleep(5000);
	        String actual = Loginpageobj.text();
	        System.out.println("Submit Message: " + actual);
	        Thread.sleep(2000);
	    }

	    @Test(priority=2,groups="smoke")
	    public void verifyResetMessage() throws InterruptedException {
//	        
	        Loginpageobj.resetbutton();
	        Thread.sleep(5000);
	        String actual = Loginpageobj.text();
	        System.out.println("Reset Message: " + actual);
	        Thread.sleep(5000);
	    }

	    @AfterTest
	    public void closebrowser() {
	        driver.quit();
	    }

		
	}
	



