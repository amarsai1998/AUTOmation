package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class allactions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
         
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://dev-refactor.credentialmydoc.com/");
	    
	    driver.findElement(By.xpath("html/body/ctg-root/ngx-spinner/../app-signin/section/div/div/div/div/form/div/input"));
	   
	    Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//input[@formcontrolname='credential']"));
	    
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).click();
		
		driver.manage().window().maximize();
		
		
		//Right click
       /*		
		WebElement Button=driver.findElement(By.xpath(""));
		
		Actions act=new Actions(driver);
		
		act.contextClick(Button).perform();//right click
		*/
		
		//2 double click
		/*
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")).clear();
		driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")).sendKeys("php");
		
		WebElement Button=driver.findElement(By.xpath(""));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(Button).perform();
		*/
		
		//3 drag and drop
		/*
	WebElement cargo= driver.findElement(By.id(""));//one box
		WebElement ship= driver.findElement(By.id(""));// two box
		
		Actions act=new Actions(driver);

	act.dragAndDrop(ship, cargo).perform();
	*/
		
	//4 image drag and drop
		
		/*
		driver.switchTo().frame("iframeResult");
		
		WebElement yard= driver.findElement(By.id(""));//one box

		WebElement ocean= driver.findElement(By.id(""));// two box

		WebElement moving=driver.findElement(By.xpath(""));// this for moving box

		Actions act=new Actions(driver);

	    act.dragAndDrop(yard, moving).build().perform();
	    
	    act.dragAndDrop(ocean, moving).perform();
	    */
		
	    //5 mouse hover
	    
	    WebElement main =driver.findElement(By.xpath("//aside[@class='left-sidebar']"));

	    WebElement menu =driver.findElement(By.xpath("//a[@class='sidebar-link has-arrow waves-effect waves-dark ng-star-inserted']//span[@class='hide-menu'][normalize-space()='Workflow']"));
	    
		Actions act=new Actions(driver);

	    act.moveToElement(main).moveToElement(menu).click().perform();

	    
	    
	}

}
