package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jesus\\Documents\\Personal\\Trainings\\Selenium\\Downloads\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Jesus\\Documents\\Personal\\Trainings\\Selenium\\Downloads\\Driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Execution complete");

	}
}
