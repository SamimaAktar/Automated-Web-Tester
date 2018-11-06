import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daraj {
	
public void run()  {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shoshi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.daraz.com.bd/?spm=a2a0e.home.header.dhome.479c1b94gaWrPo");
		System.out.println(driver.getTitle());
		
		WebElement var1=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		var1.click();
		
		WebElement var2=driver.findElement(By.xpath("(//input[@value=''])[3]"));
		var2.sendKeys("01836575180");
		WebElement var3=driver.findElement(By.xpath("(//input[@value=''])[3]"));
		var3.sendKeys("iit75180");
	
		WebElement var4=driver.findElement(By.xpath("//button[@type='submit']"));
		var4.click();
 
		}


}
