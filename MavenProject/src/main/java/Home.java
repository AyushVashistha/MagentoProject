

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Home {

	/**
	 * it is a instance variable to assign the driver
	 *
	 */
	
	WebDriver driver;
	
	/**
	 * locating the myaccount element
	 */
	By myacc = By.linkText("My Account");
	
	/**
	 * @param driver This is used to assign the driver reference
	 */
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * This method will perform a click on my account field
	 */
	public void clickOnMyAccount() {
		driver.findElement(myacc).click();
	
	}
	
	
	
	
}
