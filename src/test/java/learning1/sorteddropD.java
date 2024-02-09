package learning1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sorteddropD {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chorme.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe" );
	
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://dev.credentialmydoc.com/");
        
        driver.manage().window().maximize();
        
        WebElement ele=driver.findElement(By.id("animals"));
        
        Select se=new Select(ele);
        
        List original=new ArrayList();
        List TempLIST=new ArrayList();

      List <WebElement> options=se.getOptions();
      
     
      //2 Step (one) org
      
      for(WebElement el:options) {
    	  
    	  original.add(el.getText());  
      }
        System.out.println("original data from drop-down"+original);//1
        
        
        //3 Step (two) temp
    
             System.out.println("Before sorting temp list"+  TempLIST);//2
             
             //4 step (three) sorted
             
             Collections.sort(TempLIST);
             System.out.println("After sort original "+original);//1

             System.out.println("After sorting templist "+ TempLIST);
             
             if(original == TempLIST) {
            	 System.out.println("sorted");
             }
             else {
            	 System.out.println("NOT sorted");
             }
             


	}

}
