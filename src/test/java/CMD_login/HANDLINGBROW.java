package CMD_login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLINGBROW {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.credentialmydoc.com/");
		
		
		
		//getwindowhandle(single)
		//String webid=driver.getWindowHandle();// return id of the single browser window
		
		//System.out.println(webid);
          

		driver.findElement(By.xpath("//a[normalize-space()='CredentialMyDoc New Look and Feel!']")).click();
		
		//getwindowhandles(two)

		Set<String> Id=driver.getWindowHandles();//return id of the multiple browser window
		
		
		/*
		//First method- iterator
		Iterator <String> FS=Id.iterator();
		
		String parent=FS.next();
		String child=FS.next();
		
		System.out.println("parent id"+ parent);
		System.out.println("child id"+ child);
		*/
		
		//second method -list collection
		
	 List<String> M2=new ArrayList(Id);//converting set to ----> list
	  
	/* String parentWid=M2.get(0);
	 String childWid=M2.get(1);
	 
	 System.out.println("parent id"+ parentWid);
	 System.out.println("parent id"+ childWid);
		
	 //switching 
	 
	 driver.switchTo().window(parentWid);
	 System.out.println("parent id"+ driver.getTitle());
	 
	 driver.switchTo().window(childWid);
	 System.out.println("child id"+ driver.getTitle());
	 */
	 
	 // for each loop
	 
	 for(String M4:M2) 
	 {
		  
	 //	 System.out.println(M4);//it will print all 
		 
		 String TITLE1and2=driver.switchTo().window(M4).getTitle();
		 System.out.println(TITLE1and2);

	 }
		// driver.close();//it will close single browser
		 
		 driver.quit();// it will close all browser
	
	}

}
