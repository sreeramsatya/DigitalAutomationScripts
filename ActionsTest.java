package ArmTest1.ArmTestArti1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.amazon.com/
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromebrowserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//Actions class used to do actions like mouse over to, right click, context menu etc
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		//enter cap letter in the search editbox 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//rightclick on the editbox and check right click options displayed
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();

	}

}
