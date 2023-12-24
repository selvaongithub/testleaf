package open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvakumar\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		//basic operation 
		//		driver.findElement(By.id("j_idt88:name")).sendKeys("selva");
		//		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys("text");
		//		driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		//		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		//		

		//changine aboout element in to readable code

		WebElement name=driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("selva");

		WebElement append =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		append.sendKeys("text");

//no such a element exception
//		WebElement getvalue=driver.findElement(By.name("My learning is superb so far."));
//		getvalue.getAttribute("value");
		
		WebElement getvalue=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value=getvalue.getAttribute("value");
		System.out.println(value);
		


		WebElement clear =driver.findElement(By.name("j_idt88:j_idt95"));
		clear.clear();
		
		WebElement isenabled=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		Boolean enable=isenabled.isEnabled();
		System.out.println(enable);






	}

}
