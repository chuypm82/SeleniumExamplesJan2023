package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GeckoDriverHeadLess {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution in Headless Mode");
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		System.out.println("The page title is " +driver.getTitle());
		driver.quit();
		System.out.println("Execution completed");
	}
}
