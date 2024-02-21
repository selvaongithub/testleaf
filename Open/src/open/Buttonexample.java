package open;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvakumar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml"); 
		//id,name,class name ,xpath,
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText(" Dashboard")).click(); //give a dashboard instead of go to dashboard
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvakumar\\Downloads\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.leafground.com/button.xhtml");
//		
//		//get position
//		WebElement getposition=driver.findElement(By.id("j_idt88:j_idt94"));
//		org.openqa.selenium.Point pointxy=getposition.getLocation();
	
	
		
		
		
		
	}

}
