package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class devlogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\AmarVeeravalli\\Downloads\\edgedriver_win64 (5).exe");
		
		System.setProperty("webdriver.chrome.driver", "C://Users\\AmarVeeravalli//Downloads//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(5000);
		driver.get("https://dev-refactor.credentialmydoc.com/expirations");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/ctg-root/ngx-spinner/../app-signin/section/div/div/div/div/form/div/input")).sendKeys("ctg@credentialmydoc.com");
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@formcontrolname='credential']")).sendKeys("CTGadmin2018!");
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-outline-dark customOrange']")).click();//for change password
		
		
		driver.findElement(By.xpath("//*[@class='btn customWhite ng-star-inserted']")).click();//add task
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/ctg-root/ngx-spinner/../router-outlet/../app-main-layout/app-header/../section/app-side-nav/div/div/aside/div/nav/ul/li[2]/a/i/../span")).click();

		Thread.sleep(2000);
		
		String exptitle="CredentialMyDoc - Credentialing and Provider Enrollment Made Easy";
		
		String actualtitle=driver.getTitle();
	
		
		if(exptitle.equals(actualtitle))
		{
			System.out.println("test passed");
			
		}
		else	
		{
				System.out.println("test failed");
			
		}
		
		
	}

}
