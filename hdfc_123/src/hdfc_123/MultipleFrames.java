package hdfc_123;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='FilemailMessageToURL']")).sendKeys("FileUploading");
		//Actions act=new Actions(driver);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(.,'Background')]")).click();
		List<WebElement> h=driver.findElements(By.xpath("(//font)[1]"));
		System.out.println(h.size());
	
	String s=h.get(0).getText();
	System.out.println(s);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Alok Bro");
	WebElement e=driver.findElement(By.xpath("//textarea[@name='browser']"));
	Thread.sleep(3000);
	System.out.println(e.getAttribute("value"));
	Thread.sleep(3000);
	e.clear();
	Thread.sleep(3000);
	e.sendKeys("chromebrowser version1.0.2"); 
	Thread.sleep(3000);
	//String b=e.getText();
//	System.out.println(b);
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,30)", "");
	driver.findElement(By.xpath("//textarea[@name='suggestions']")).sendKeys("Hai Bro this is alok i am getting ready for lunch after i will back again with in halg an hour");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Alert c=driver.switchTo().alert();
	System.out.println(c.getText());
	c.accept();
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	
	driver.switchTo().frame(2);
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,30)", "");
	driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
	System.out.println(driver.getTitle());
	Set<String> Window=driver.getWindowHandles();
	List<String> lis=new ArrayList<>(Window);
	driver.switchTo().window(lis.get(1));
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//textarea")).sendKeys("Hai this is Balu");
	driver.findElement(By.xpath("//input[@type='BUTTON']")).click();
	Alert k=driver.switchTo().alert();
	System.out.println(k.getText());
	k.accept();
	}
	
	
	
	

}
