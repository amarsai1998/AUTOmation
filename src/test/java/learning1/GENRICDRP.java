package learning1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GENRICDRP {

	static WebDriver driver;

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chorme.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe" );
		
		 driver=new ChromeDriver(); 
		
		  driver.get("https://dev.credentialmydoc.com/");
		
		 driver.findElement(By.xpath("//input[@formcontrolname='email'][@placeholder='Email']")).sendKeys("ctg@credentialmydoc.com");
		
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("CTGadmin2018!");
		
		 driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		 
		 // classic approch method 1
		 /*
		 Select DRP1=new Select(driver.findElement(By.xpath("//ng-select[@placeholder='Select Payer']//div[@class='ng-select-container']")));
		 DRP1.selectByVisibleText("1199SEIU Benefit Funds");
		 
		 Select DPR2=new Select(driver.findElement(By.xpath("//div[@aria-expanded='true']//input[@type='text']")));
		 DPR2.selectByVisibleText("High");
 */
         //Apporoch 2
		 
		WebElement AP1= driver.findElement(By.xpath("//ng-select[@placeholder='Select Payer']//div[@class='ng-select-container']"));
		SelectoptionfromDRP(AP1,"1199SEIU Benefit Funds");
		
		
		WebElement AP2= driver.findElement(By.xpath("//div[@aria-expanded='true']//input[@type='text']"));
		SelectoptionfromDRP(AP2,"HIGH");
	
		
		
	}
	public static void SelectoptionfromDRP(WebElement ap,String value) 
	{
		Select TS=new Select(ap);
		
		List<WebElement> TN=TS.getOptions();
		
		for(WebElement KL:TN) {
			   
			   if(KL.getText().equals("value")) {
				   
				   KL.click();
				   
				   break; 
	        }
		}
	}
}
