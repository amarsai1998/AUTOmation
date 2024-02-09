package learning1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotkey {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("Webdriver.chorme.driver","\"C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe\"" );

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.credentialmydoc.com/");
		
				driver.findElement(By.xpath(""));

		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_DOWN);
		
		
		WebElement times=driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']\r\n"	+ ""));
		 
		 
	        Actions actions = new Actions(driver);

		
		for(int i=0;i<=3;i++) {
			
			actions.click(times);
		}
		
		actions.perform();
		
		driver.quit();
	}

}
