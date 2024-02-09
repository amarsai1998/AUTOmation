package learning1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chorme.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver(); 
		
		  driver.get("https://dev.credentialmydoc.com/");
		
		 driver.findElement(By.xpath("//input[@formcontrolname='email'][@placeholder='Email']")).sendKeys("ctg@credentialmydoc.com");
		
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("CTGadmin2018!");
		
		 driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		//1
		 
	   WebElement PYR=	driver.findElement(By.xpath("//ng-select[@placeholder='Select Payer']//div[@class='ng-select-container']"));
	
        Select SPYR=new Select(PYR);
        /*
        SPYR.selectByVisibleText("1199SEIU Benefit Funds");
        SPYR>selectBYindexvalue("");
        */
	   List<WebElement> GET=SPYR.getOptions() ;
	   
	   //(For-each loop) for list of webelements
	 /* 
	   for(WebElement MMS:GET) {
		   
		   if(MMS.getText().equals("1199SEIU Benefit Funds")) {
			   
			   MMS.click();
			   
			   break;   
		   }
	   
           }
	   */
	         
	         
		
		
		
		

	}

}
