package learning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptalerts {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chorme.driver","\"C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe\"" );
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev-refactor.credentialmydoc.com/");
		
		driver.findElement(By.xpath(""));
		driver.switchTo().alert().accept();//for close the alert message and click on OK button
		
		driver.findElement(By.xpath(null));
		driver.switchTo().alert().dismiss();//TO click on close button in alert
		
	}

}
