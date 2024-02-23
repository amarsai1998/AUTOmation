package CMD_login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptutil {
	
	public static void flash(WebElement element ,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");//blue
		
		for(int i=0;i<500;i++) {
			
			ChangeColor("#c93d82",element,driver);//1
			ChangeColor(bgcolor,element,driver);//2

			
		}
	}
 public static void ChangeColor(String color,WebElement element ,WebDriver driver) {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 	 js.executeScript("argumnets[0].style.backgroundColor='"+color+"'",element);
	 	 

	 	 try {
	        Thread.sleep(20);
	 	 }   catch(InterruptedException e) {
	 		 
  }
  }
 public static void borderline(WebElement element ,WebDriver driver) {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 	 js.executeScript("argumnets[0].style.border='3px solid red",element);
 }
 
 public static String Titlets(WebDriver driver)
 {
	 JavascriptExecutor js=( (JavascriptExecutor)driver);
	 String title=js.executeScript("return document.title").toString();
	 return title;
	 }
 
 public static void ClickM(WebElement element,WebDriver driver) {
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	 js.executeScript("arguments[0].click();",element);
	 
 }
 public static void jsalert(WebDriver driver,String message) {
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
            js.executeScript("alert('"+message+"')");
            
 }
 public static void Refresh(WebDriver driver){
	 JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("history.go(0)");


 }
 public static void Scroll(WebElement element ,WebDriver driver){
	 JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(true);",element);
     
 } 
 public static void Scroll2(WebDriver driver){
	 JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollTO(0,document.body.scollHeight");
     }

}