package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Execution after setting driver path in system variables");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Execution complete");

	}

}
