package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

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
		Select y =new Select(driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")));
		y.selectByVisibleText("2023");
		
		for (int i=6;i>=1;i--) {

			driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']"));
			
			String m=driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).getText();
			
			if (m.equals("December")) {
				driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).click();
				break;
			}
			}
		

	}

}
