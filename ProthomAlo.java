import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProthomAlo {
	
	private static WebDriverWait wait;
	
public void run()  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shoshi\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.prothomalo.com");
	System.out.println(driver.getTitle());
	WebElement var1=driver.findElement(By.xpath("(//a[contains(text(),'বাংলাদেশ')])[2]"));
	var1.click();
	WebElement var2=driver.findElement(By.xpath("(//a[contains(text(),'খেলা')])[2]"));
	var2.click();
	WebElement var3=driver.findElement(By.xpath("//a[contains(text(),'English')]"));
	var3.click();
	
	
	

	}

}
