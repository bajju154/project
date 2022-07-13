package hdfc_123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.filemail.com/share/upload-file");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='FilemailMessageToURL']")).sendKeys("FileUploading");
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//*[@id='addBtn']"))).build().perform();
		
		Robot robo=new Robot();
		StringSelection sel=new StringSelection("C:\\Users\\DELL\\Desktop\\New folder\\Prasad.docx");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
