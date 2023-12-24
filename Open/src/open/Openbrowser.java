package open;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Openbrowser {
	public static void main(String[] args) {
		//google
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvakumar\\Downloads\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//driver.get("https://google.co.in");

System.setProperty("webdriver.edge.driver","C:\\Users\\Selvakumar\\Downloads\\edge driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://google.co.in");
//enter a search term 
//click a wikipedia
driver.findElement(By.name("q")).sendKeys("selamar138"+Keys.ENTER);
//driver.quit();
	}
	}



