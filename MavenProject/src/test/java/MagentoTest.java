
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author Ayush
 * @since 14/11/2018
 * @version jdk1.8
 */
public class MagentoTest {

	/**
	 * @param args
	 *            It is not used open the browser launching magento
	 * @throws Exception
	 */
	@Test
	public void posCredentials() throws Exception{
		String url = "https://www.magento.com";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyAccount();

		Login l1 = new Login(driver);
		l1.typeEmail("sucheendra.abc@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();

		Logout l2 = new Logout(driver);
		l2.clickOnLogout();

		Thread.sleep(3000);

		driver.quit();

	}

}
