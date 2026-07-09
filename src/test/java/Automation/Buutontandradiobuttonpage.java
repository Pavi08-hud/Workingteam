package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Buutontandradiobuttonpage {
	WebDriver driver; 
	Actions act;
	public Buutontandradiobuttonpage(WebDriver driver) {
		this.driver = driver;
	}
	//locators
	
	By single = By.id("single-click-btn");
	By dbclick = By.id("double-click-btn");
	By right = By.id("right-click-btn");
	By alwaysDisabled = By.xpath("//button[text()='Always Disabled']");
	By startTimer = By.xpath("//button[text()='Start 3s Timer']");
	By enablesBtn = By.xpath("//button[text()='Enables in 3s']");
	By singleClickMsg = By.xpath("//p[@data-testid='single-click-result']");
	By doubleClickMsg = By.xpath("//p[@data-testid='double-click-result']");
	By rightClickMsg  = By.xpath("//p[@data-testid='right-click-result']");
	//Actions
	
	public void singleclick() {
         driver.findElement(single).click();
	}
	
	public void Doubleclick() {
		act = new Actions (driver);
		act.doubleClick(driver.findElement(dbclick)).perform();
		}	
	
	public void rightclick() {
		act = new Actions (driver);
		act.contextClick(driver.findElement(right)).perform();
		}
	
	public String getSingleMessage() {
	    return driver.findElement(singleClickMsg).getText();
	}

	public String getdoublemessage() {
		
		
	    return driver.findElement(doubleClickMsg).getText();
	}

	public String getRightMessage() {
		WebElement element = driver.findElement(rightClickMsg);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element);
        return element.getText();
//	    return driver.findElement(rightClickMsg).getText();
	}
	
	private boolean isAlwaysDisabledButtonDisabled() {
		return driver.findElement(alwaysDisabled).isEnabled();

	}
	
	public void clickStartTimer() {
	    driver.findElement(startTimer).click();
	}

	public void clickEnablesButton() throws InterruptedException {
	    // Wait for button to become enabled
	    WebElement btn = driver.findElement(enablesBtn);
	    
	    // Keep checking every 500ms until enabled
	    while (!btn.isEnabled()) {
	        Thread.sleep(500);
	        btn = driver.findElement(enablesBtn);
	    }
	    btn.click();
	}

	public boolean isEnablesButtonEnabled() {
	    return driver.findElement(enablesBtn).isEnabled();
	}
	
	
	
	
	
	
	

}
