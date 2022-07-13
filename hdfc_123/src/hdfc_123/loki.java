package hdfc_123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loki {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      Thread.sleep(3000);
	      driver.findElement(By.linkText("CONTINUE TO THE NEW LOGIN PAGE FOR NETBANKING")).click();
	      Thread.sleep(3000);
	      driver.switchTo().frame(0);
	      driver.findElement(By.linkText("Forgot Customer ID")).click();
	      Thread.sleep(4000);
	      driver.navigate().back();
	      Thread.sleep(4000);
	      driver.navigate().forward();
	      Thread.sleep(4000);
	      driver.navigate().refresh();

	      
	}

}
