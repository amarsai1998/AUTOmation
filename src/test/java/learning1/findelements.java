package learning1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	/*	
		driver.get("https://dev.credentialmydoc.com/");
		
		//find element--for single web element 
		WebElement username=driver.findElement(By.xpath("//input[@formcontrolname='email'][@placeholder='Email']"));
		
		username.sendKeys("CMD@credentialmydoc.com");//1
		*/
		
		
		//2
		driver.get("https://www.skillshare.com/");
		
		
		
	List<WebElement> section=driver.findElements(By.xpath("//div[@class='MuiGrid-root jss279 MuiGrid-container']//a"));
		System.out.println(section.size());
		
		for(WebElement ele:section)
		{
			System.out.println(ele.getText());
	if(ele.getText().equals("Animation"))
	{
		ele.click();
		break;
	}
				
		}
		
		
		
	}
				
			
		
		
		
		
		
	}


