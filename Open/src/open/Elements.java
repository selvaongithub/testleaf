package open;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvakumar\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
	//link text
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		//driver.findElement(By.partialLinkText("Go to Dashboard")).click();
		

	}

}
