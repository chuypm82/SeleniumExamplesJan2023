package elementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String sRow = "2";
		String sCol = "3";
		
		//Here we are locating the xpath by passing variables in the xpath
		String sCellValue = driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
		System.out.println(sCellValue);
		System.out.println(driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[2]/td[2]")).getText());		
		String sRowValue = "Position";
				
		//First loop will find the 'Position' in the first column
		for (int i=1;i<=4;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath("(//table[@id='product'])[2]/thead/tr/th[" + i + "]")).getText();
				if(sValue.equalsIgnoreCase(sRowValue)){
					 List<WebElement> rows = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td["+i+"]"));
					 int size= rows.size();
					// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
					for (int j=1;j<=size;j++){
						String sColumnValue= driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[" + j + "]/td[" + i + "]")).getText();
						System.out.println(sColumnValue);
					}
				break;
				}
			}
		
		driver.quit();
	}
}
