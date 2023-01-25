package elementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		Select select = new Select (driver.findElement(By.xpath("//*[@id='cars']")));
		
		if(select.isMultiple()) {
			select.selectByIndex(0);
			Thread.sleep(1000);
			select.selectByIndex(2);
			Thread.sleep(1000);
			
			/*select.selectByValue("volvo");
			Thread.sleep(1000);
			select.selectByValue("audi");
			Thread.sleep(1000);
			
			select.selectByVisibleText("Volvo");
			Thread.sleep(1000);
			select.selectByVisibleText("Opel");
			Thread.sleep(1000);*/
		}
		
		List<WebElement> options = select.getOptions();
		WebElement firstSelectedOption= select.getFirstSelectedOption();
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
					
		driver.quit();
	}
}
