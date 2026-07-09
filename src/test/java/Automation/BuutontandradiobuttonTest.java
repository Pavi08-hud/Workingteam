package Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BuutontandradiobuttonTest {
	
	 WebDriver driver;
	    Buutontandradiobuttonpage pageobj;

	    @BeforeTest
	    public void launchbrowser() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.sreenidhirajakrishnan.com/practice");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        pageobj = new Buutontandradiobuttonpage(driver);
	        Thread.sleep(3000);
	    }

	    @Test(priority=4, groups="smoke")
	    public void singleactionclick() throws InterruptedException {
	        pageobj.singleclick();
	        System.out.println("Single click done");
	        Thread.sleep(3000);
	        String message = pageobj.getSingleMessage();
	        System.out.println("Single Click Message: " + message); // Single clicked!
	    }

	    @Test(priority=5, groups="smoke")
	    public void doubleactionclick() throws InterruptedException {
	        pageobj.Doubleclick();
	        System.out.println("Double click done");
	        Thread.sleep(3000);
	        String message = pageobj.getdoublemessage();
	        System.out.println("Double Click Message: " + message); // Double clicked!
	    }

	    @Test(priority=6, groups="smoke")
	    public void rightactionclick() throws InterruptedException {
	        pageobj.rightclick();
	        System.out.println("Right click done");
	        Thread.sleep(3000);
	        String message = pageobj.getRightMessage();
	        System.out.println("Right Click Message: " + message); // Right click captured!
	    }

//	    @AfterTest
//	    public void closebrowser() {
//	        driver.quit();
//	    }

}
