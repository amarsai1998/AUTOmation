package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

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
		
	   /* 
	    WebElement main =driver.findElement(By.xpath("//aside[@class='left-sidebar']"));

	    WebElement menu =driver.findElement(By.xpath("//a[@class='sidebar-link has-arrow waves-effect waves-dark ng-star-inserted']//span[@class='hide-menu'][normalize-space()='Workflow']"));
	    
		Actions act=new Actions(driver);

	    act.moveToElement(main).moveToElement(menu).click().perform();
          
          */
	    //6 Range slider
		
	//	WebDriverManager.chromedriver().setup(); // this will setup the method and we no need to give paths.
		
	/*	WebElement first_slider=driver.findElement(By.xpath("//span[1]"));
		
		
	System.out.println(	first_slider.getLocation());
	
	System.out.println(first_slider.getSize());
	
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(first_slider, 100, 0).perform();
		
		
		System.out.println(	first_slider.getLocation());
		
		System.out.println(first_slider.getSize());
		
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
		act.dragAndDropBy(max_slider, -110, 0).perform();
	
		
    System.out.println(	max_slider.getLocation());
		
		System.out.println(max_slider.getSize());
	*/
	    //7 Actions and action
	/*	
	WebElement feature=	driver.findElement(By.xpath("//li[normalize-space()='VBScript Tutorial']"));
		
		Actions act= new Actions(driver);
		
		//act.moveToElement(feature).perform();
		
		Action action=act.moveToElement(feature).build();
		
		action.perform();
		*/
		//8 keyboard actions(single key )
		/*
		driver.findElement(By.xpath("https://www.tutorialspoint.com/vbscript/vbscript_syntax.htm"));
		Actions act =new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ESCAPE).perform();
		*/
		// 9 keyboard actions(multiple key)
		
	WebElement Firstbox =	driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		WebElement Secondbox= driver.findElement(By.xpath("//input[@placeholder='Enter Task ID']"));
		
		Firstbox.sendKeys("Copy");
Actions act =new Actions(driver);
//CTRL A-Select
     act.keyDown(Keys.CONTROL);
     act.sendKeys("a");
     act.keyUp(Keys.CONTROL);
      act.perform();
      
      act.keyDown(Keys.CONTROL);
      act.sendKeys("c");
      act.keyUp(Keys.CONTROL);
       act.perform();
	}



	}

