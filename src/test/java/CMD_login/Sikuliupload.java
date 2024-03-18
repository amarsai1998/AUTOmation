package CMD_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuliupload {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("Webdriver.chorme.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
          
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.credentialmydoc.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("ctg@credentialmydoc.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("CTGadmin2018!");
		
		driver.findElement(By.xpath("//input[@id='files']")).click();
		
		String Imagefilepath="C:\\Users\\AmarVeeravalli\\Pictures\\Screenshots";
		String Inputtextfile="C:\\Users\\AmarVeeravalli\\Pictures\\Screenshots";
		
		Screen s=new Screen();
		
		Pattern fileInputTextbox=new Pattern(Imagefilepath+"Imagefilepath.png");
		Pattern openbutton=new Pattern(Imagefilepath+"openbutton.png");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,Inputtextfile+"db upgrade.pdf");
		s.click(openbutton);
	}

}
