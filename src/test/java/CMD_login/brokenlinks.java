package CMD_login;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException {
		
		//initate driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
          
		//maximize page
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
		
		//url
		driver.get("https://dev.credentialmydoc.com");
		
		
		//capture number of links
		List <WebElement> links=driver.findElements(By.linkText("a"));
		
		//No of links
		System.out.println(links.size());
		
		for (int i =0;i<=links.size();i++) {
			
			// By using href attribute we get url of requied link
			WebElement element =links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			
		}
		
		
		
		
		
	}

}
