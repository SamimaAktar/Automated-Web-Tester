import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goodreads {
	
public void run()  {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shoshi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goodreads.com");
		System.out.println(driver.getTitle());
		WebElement var1=driver.findElement(By.xpath("//input[@id='userSignInFormEmail']"));
		var1.sendKeys("bsse0706@iit.du.ac.bd");
		WebElement var2=driver.findElement(By.xpath("//input[@id='user_password']"));
		var2.sendKeys("iit75180");
		
		WebElement var3=driver.findElement(By.xpath("//input[@value='Sign in']"));
		var3.click();
		
		WebElement var4=driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]"));
		var4.click();
		
		WebElement var5=driver.findElement(By.xpath("(//a[contains(text(),'My Books')])[2]"));
		var5.click();
		
		}


}
