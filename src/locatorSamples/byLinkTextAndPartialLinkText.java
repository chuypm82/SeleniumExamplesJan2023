package locatorSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byLinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		WebElement element = driver.findElement(By.linkText("Home"));
		
		if(element != null) {
			System.out.println("Element found by LinkText");
		}
		
		element= driver.findElement(By.partialLinkText("Home"));
		
		if(element!= null) {
			System.out.println("Element found by PartialLinkText: " + element.getText());
		}
		
		driver.quit();
	}
}
