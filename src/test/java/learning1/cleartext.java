package learning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartext {

	public static void main(String[] args)  {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		 WebDriver  driver=new ChromeDriver();
		
		    driver.get("https://dev.credentialmydoc.com/");
		     
		       driver.manage().window().maximize();
		
                 WebElement clr=driver.findElement(By.xpath("//input[@type='text']"));
                //1
                  /* clr.clear();
                 
                    clr.sendKeys("vinaydev@gmail.com");*/
                 
                 //2 capture text form input box
                 
                 clr.sendKeys("rreddy@gmail.com");
                 
              String SMG =   clr.getAttribute("type");
                 
                 System.out.println("RESULTS FORM GET ATTRIBUTE = "+ SMG);    
                 
             WebElement buttonname =   driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
         
             String BTS =   buttonname.getText();
          
                 System.out.println("RESULTS FORM GET TEXT = "+ BTS);
                   
	}

}
