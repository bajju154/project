package hdfc_123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rb.gy/lg63ih");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("balamurali.546@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		

	}

}
