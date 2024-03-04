package learning1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapSELE {
	
 static HashMap <String ,String> logindata()
	{
		HashMap<String ,String>hm=new HashMap<String ,String>();
		hm.put("x","MSO1@arjun1234 ");
		hm.put("y","MSO2@arjun12345 ");
		hm.put("z","MSO3@arjun12346 ");
		hm.put("a","MSO4@arjun12347 ");
 return hm;
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://dev-refactor.credentialmydoc.com/");
		
		//login as x
		String CRED=logindata().get("x");

		String arr[]=CRED.split("@");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email'][@class='form-control ng-dirty ng-valid ng-touched']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		String CR=logindata().get("y");

		String arr2[]=CRED.split("@");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email'][@class='form-control ng-dirty ng-valid ng-touched']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
            
		
		String CED=logindata().get("z");

		String arr3[]=CRED.split("@");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email'][@class='form-control ng-dirty ng-valid ng-touched']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		
		String CR1=logindata().get("a");

		String arr4[]=CRED.split("@");
		
		driver.findElement(By.xpath("//input[@formcontrolname='email'][@class='form-control ng-dirty ng-valid ng-touched']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();


		
		if(driver.getTitle().equals("CredentialMyDoc - Credentialing and Provider Enrollment Made Easy")) {
			System.out.println("Test passed");
		}
			else {
				System.out.println("Test failed");
			
			}
        driver.findElement(By.linkText("GENERATE FORM "));
	}

}
