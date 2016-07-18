package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public void display(){
		System.out.println("Hello world");
	}
	
	@Test
	public void first()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\papi\\git\\test_jenkin\\Test_jenkin\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("geetesh001@yahoo.co.in");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("papi6789");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
