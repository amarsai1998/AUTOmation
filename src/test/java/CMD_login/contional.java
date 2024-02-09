package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contional {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users\\AmarVeeravalli//Downloads//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

				driver.get("https://dev-refactor.credentialmydoc.com/expirations");
				
			//	WebElement con=driver.findElement(By.xpath("driver.get(\"https://dev-refactor.credentialmydoc.com/expirations\");\r\n"));
			/*	
				WebElement pass=driver.findElement(By.xpath("//input[@formcontrolname='credential']"));
				
				if(con.isDisplayed() && con.isEnabled())
						{
					con.sendKeys("reddy@gmail.com");
						}
             */
				WebElement aa=driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
				String RANA=aa.getText();
				int nooftimes=5;
				for(int i=1;i<=nooftimes;i++) {
				System.out.println(RANA);
				driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("reddy@gmail.com");
				    
				}

	}
				
				
}
