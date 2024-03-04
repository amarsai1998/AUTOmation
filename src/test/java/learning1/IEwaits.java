package learning1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IEwaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	
    	
    //Fluent wait	declaration
    	Wait<WebDriver> Iwaiting = new FluentWait<WebDriver>(driver)
    		    .withTimeout(Duration.ofSeconds(30L))
    		    .pollingEvery(Duration.ofSeconds(5L))
    		    .ignoring(NoSuchElementException.class);
    	
    	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// 1) implicit wait 
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
		
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	 */
		
	// 2)explicit wait 
	
	//	WebDriverWait ewait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
	
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		
		
		/*
		//genric 
		
  By locator1=By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='rhs']/div[@id='_akTYZanJCcj61e8PyoitmAo_45']/div[@jsname='xQjRM']/div[@class='sATSHe']/div/div[@data-hveid='CCYQAA']/div[@data-hveid='CCYQAQ']/div/div[@class='NYidgb']/div[@id='_akTYZanJCcj61e8PyoitmAo_38']/div[@class='RyIFgf']/div[@role='list']/div[3]/div[1]/div[1]/div[1]/a[1]");
  By locator2=By.xpath("//div[@data-hveid='CIoBEAA']//div[@class='lSfe4c r5bEn']");	  
          waitForElementPresent (driver,locator1,10);
          waitForElementPresent (driver,locator2,10);

          
        //   WebElement LOC=ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='rhs']/div[@id='_akTYZanJCcj61e8PyoitmAo_45']/div[@jsname='xQjRM']/div[@class='sATSHe']/div/div[@data-hveid='CCYQAA']/div[@data-hveid='CCYQAQ']/div/div[@class='NYidgb']/div[@id='_akTYZanJCcj61e8PyoitmAo_38']/div[@class='RyIFgf']/div[@role='list']/div[3]/div[1]/div[1]/div[1]/a[1]")));
         //   LOC.click();
            
	
	}
public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
 {
	 WebDriverWait ewait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	 ewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	 return driver.findElement(locator);
}
*/
		//usage of fluent wait
		
		WebElement element=Iwaiting.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[@data-hveid='CIoBEAA']//div[@class='lSfe4c r5bEn']"));
			}
		});
		
		element.click();
		//return element;
}
}
