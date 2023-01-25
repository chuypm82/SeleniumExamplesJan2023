package automationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {

		//Setting the Driver path
		System.setProperty("webdriver.chrome.dirver", 
				"C:\\Users\\Jesus\\Documents\\Personal\\Trainings\\Selenium\\Downloads\\Driver");
		//Creating webDriver instance
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver= new FirefoxDriver();
		
		//Navigate to web page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//use implicit wait to wait for pages to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Maximize window
		driver.manage().window().maximize();
		
		//Retrieving web page title
		String title= driver.getTitle();
		System.out.println("The page title is: "+ title);
		
		//Locating web element
		WebElement uName= driver.findElement(By.xpath("//input[@id='inputUsername']"));
		WebElement pass= driver.findElement(By.xpath("//input[@name='inputPassword']"));
		WebElement loginBtn= driver.findElement(By.xpath("//button[@class='submit signInBtn']"));
		
		//Performing actions on web elements
		uName.sendKeys("Jesus");
		pass.sendKeys("rahulshettyacademy");
		loginBtn.click();
		
		//putting implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Validate user was able to login
		try {
			//locating web element
			WebElement logOutBtn= driver.findElement(By.xpath("//button[@class='logout-btn']"));
			//validating presence of web element
			if(logOutBtn.isDisplayed()) {
				//Performing action on web element
				logOutBtn.click();
				System.out.println("Logout Successful");	
			}			
		}
		catch (Exception e){
			System.out.println("Incorrec Login...");
			
		}
		//Closing browser session
		driver.quit();		
	}
}
