package CMD_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		
		//initate driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
          
		//maximize page
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(null);
	}

}
