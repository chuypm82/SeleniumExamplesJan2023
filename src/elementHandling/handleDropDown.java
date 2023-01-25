package elementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		Select select = new Select (driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));

		select.selectByIndex(3);
		Thread.sleep(1000);
		select.selectByValue("6");
		Thread.sleep(1000);
		select.selectByVisibleText("Aqua");
		
		driver.quit();
	}
}
