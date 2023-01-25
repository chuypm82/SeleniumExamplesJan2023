package locatorSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");

		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		//WebElement parentElement = driver.findElement(By.className("btn"));
		WebElement parentElement = driver.findElement(By.className("signInBtn"));
		
		parentElement.click();

		if (parentElement != null) {
			System.out.println("Element found by ClassName");
		}

	}
}
