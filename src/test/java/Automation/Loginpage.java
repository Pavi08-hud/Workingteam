package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebDriver driver;

//    constructor
	public Loginpage(WebDriver driver){
		this.driver=driver;
		}
	
//	locators
	By name =By.id("text-input");
	By password = By.id("password-input");
	By submit = By.id("form-submit");
    By reset = By.id("form-reset");
    By getvalues = By.xpath("//p[@data-testid='form-result']");
	
//	action
	
	public void selectusername(String usename) {
	driver.findElement(name).sendKeys(usename);

	}
	
	public void clickpassword(String pass) {
	driver.findElement(password).sendKeys(pass);

	}
	
	public void clicksubmit() {
		driver.findElement(submit).click();
     }
	
	public void resetbutton() {
		driver.findElement(reset).click();
     }
	
	  public String text() {
	        WebElement element = driver.findElement(getvalues);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(false);", element);
	        return element.getText();
	    }
	
	
}
