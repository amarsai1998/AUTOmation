package CMD_login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutors {

	public static void main(String[] args) throws InterruptedException, IOException  {
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://dev.credentialmydoc.com/");
           
		driver.findElement(By.xpath("html/body/ctg-root/ngx-spinner/../app-signin/section/div/div/div/div/form/div/input"));
		   
	    Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//input[@formcontrolname='credential']"));
	    
	    Thread.sleep(2000);
	    /*
	   //1) Flashing 
	WebElement button=	driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']"));
	
	javascriptutil.flash(button, driver);
        
	 
		//2) borderline & screenshot
	javascriptutil.borderline(button, driver);
	//screen shot 
	
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\AmarVeeravalli\\Pictures");
	FileUtils.copyFile(scr,trg);
*/
	    //3title
	    
	    //System.out.println(javascriptutil.Titlets(driver));
	    
	    //4 click method
		WebElement button=	driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']"));

		javascriptutil.ClickM(button, driver);
		
		
		//5javascrpit alert message
		javascriptutil.jsalert(driver, "LAUNCH");
		
		//6 refesh page
		
		javascriptutil.Refresh(driver);
		//7 scroll 
		driver.findElement(By.xpath("//img[@title='Change Profile Picture']"));
		javascriptutil.Scroll(button, driver);
		javascriptutil.Scroll2(driver);
		
	}

	
}
