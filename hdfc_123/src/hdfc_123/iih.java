package hdfc_123;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iih {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		int e = driver.findElements(By.tagName("frame")).size();
		System.out.println(e);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9966123808");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Forgot Password / IPIN")).click();
		String mainWindow=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("click here")).click();
		//driver.findElement(By.xpath("(//a[@class='lnk'])[2]")).click();
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		System.out.println(window);
		int size = window.size();
		//String id[] = new String[size];
		for (String childWindow : window) {
			
		
		int count = 0;
		for (int i = 0; i < size; i++) {

			//id[i] = itr.toString();
			if (count == 1) {
				driver.switchTo().window(childWindow);
			}
			count++;
		}
		System.out.println(driver.getTitle());
		
		}
		
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("996612");
		driver.findElement(By.xpath("(//a)[1]")).click();
		System.out.println(driver.switchTo().alert().getText());
				
		//driver.switchTo().defaultContent();
		//driver.navigate().refresh();
		
		
		
	
			
		
	}

}
