package learning1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
	
	System.setProperty("Webdriver.Chrome.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
driver.get("https://dev-refactor.credentialmydoc.com/expirations");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		
		driver.findElement(By.xpath("html/body/ctg-root/ngx-spinner/../app-signin/section/div/div/div/div/form/div/input")).sendKeys("ctg@credentialmydoc.com");
	
		driver.findElement(By.xpath("//input[@formcontrolname='credential']")).sendKeys("CTGadmin2018!");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).click();
		
		int rowcount=driver.findElements(By.xpath("/html[1]/body[1]/ctg-root[1]/app-main-layout[1]/section[1]/div[1]/app-workflow-item[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ngx-datatable[1]")).size();
		int statuscount=0;
		
		for(int i=1;i<=rowcount;i++) {
			
			String status=driver.findElement(By.xpath("/html[1]/body[1]/ctg-root[1]/app-main-layout[1]/section[1]/div[1]/app-workflow-item[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[i]/div[2]/datatable-body-cell[1]")).getText();
			
			if (status.equals("Generated")) {
				statuscount=statuscount+1;
				System.out.println(statuscount);
			}
				else {
					System.out.println("No Data found");
				}
			
		
		   }
		
		
		}

	}


