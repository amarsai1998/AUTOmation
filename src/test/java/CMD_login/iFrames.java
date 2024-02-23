package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.Chrome.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://dev-refactor.credentialmydoc.com/");
		/*
		// 1st i frame
		driver.switchTo().frame("package list frame");
		driver.findElement(By.xpath("")).click();
		driver.switchTo().defaultContent();
		
		// 2nd i frame
		driver.switchTo().frame("package list ");
		driver.findElement(By.xpath("")).click();
		driver.switchTo().defaultContent();

		// 3nd i frame
				driver.switchTo().frame("package 3 ");
				driver.findElement(By.xpath("")).click();
				
				*/
		
		// 2nd method (inner frame)
		/*
		WebElement outerframe=driver.findElement(By.xpath("//body/ctg-root/app-main-layout[@class='ng-star-inserted']/div/ctg-custom-dashboard/div[@class='client-dashboard ng-star-inserted']/div[@class='container-fluid m-0']/div[@class='row m-0']/div[2]/div[1]/div[1]/div[2]"));
           driver.switchTo().frame(outerframe);
           
           WebElement innerframe=  driver.findElement(By.xpath(""));
           driver.switchTo().frame(innerframe);
           
           driver.findElement(By.xpath("//body[1]/ctg-root[1]/app-main-layout[1]/div[1]/ctg-custom-dashboard[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/div[2]")).sendKeys("WE WIll ROCK YOU");
         */
           //3 inner frame method -2
			driver.get("https://www.w3schools.com/html/html_iframe.asp");
			
			JavascriptExecutor javaScript = (JavascriptExecutor)driver;
	        javaScript.executeScript("window.scrollBy(0,500)");
	        
	        driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryhtml_iframe_height_width']")).click();
			
           driver.switchTo().frame("iframeResult");//switch to outer frame
           
             driver.switchTo().frame(0);//
             
   System.out.println(driver.findElement(By.xpath("//h1")).getText());
           
          driver.switchTo().parentFrame();// it will go out to outer frame
          
          String text=driver.findElement(By.xpath("//p[contains(text(),'You can also use the CSS height and width properties to specify the size of the iframe:')]")).getText();
          
          System.out.println(text);
          
	}
	

}
