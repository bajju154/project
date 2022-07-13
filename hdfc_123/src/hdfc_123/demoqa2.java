package hdfc_123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoqa2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).getAttribute("Type"));
		System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isDisplayed());
		driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isSelected());
	    driver.navigate().to("https://demoqa.com/text-box");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userName")).sendKeys("lokesh");
		System.out.println(driver.findElement(By.id("userName")).getAttribute("Type"));
		System.out.println(driver.findElement(By.id("userName")).getAttribute("value"));
}
}