package learning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableSELE {

	public static void main(String[] args) {

		System.setProperty("Webdriver.Chrome.driver","C:\\\\Users\\\\AmarVeeravalli\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		 
	int r=	driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
	System.out.println(r);

	int c=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
	System.out.println(c);
	
	for(int i=1;i<r;i++) {
		
		for(int j=1;j<c;j++) {
			
			System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[i]/td[j]")).getText()+" ");	

			
			String s=(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"))).getText();
			System.out.println(s);
			
			
		}
		
	}
	

	}

}
