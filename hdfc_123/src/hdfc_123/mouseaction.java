package hdfc_123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
Actions act=new Actions(driver);
WebElement e=driver.findElement(By.xpath("//span[.='right click me']"));
act.moveToElement(e).contextClick().build().perform();
WebElement e1=driver.findElement(By.xpath("//span[.='Copy']"));
act.moveToElement(e1).contextClick().build().perform();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	}
}