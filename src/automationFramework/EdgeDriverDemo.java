package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting EdgeDriver path in System Variables");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jesus\\Documents\\Personal\\Trainings\\Selenium\\Downloads\\Driver\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Jesus\\Documents\\Personal\\Trainings\\Selenium\\Downloads\\Driver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Execution complete");

	}
}
