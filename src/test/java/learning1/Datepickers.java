package learning1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/");

        // Find the date time picker control
        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        // Fill date as mm/dd/yyyy (e.g., 09/25/2013)
        dateBox.sendKeys("09252013");

        // Press tab to shift focus to the time field
        dateBox.sendKeys(Keys.TAB);

        // Fill time as 02:45 PM (e.g., 0245PM)
        dateBox.sendKeys("0245PM");
    }



	}


