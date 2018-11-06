import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DailyMotion {
	
	public void run()  {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shoshi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dailymotion.com");
		System.out.println(driver.getTitle());
		WebElement var1=driver.findElement(By.xpath("//input[@id='search']"));
		var1.sendKeys("dhaka");
		var1.click();
//		WebElement var2=driver.findElement(By.xpath("//video[@id='dmp_Video']"));
//		var1.click();
		
		
		}

}
