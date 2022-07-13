package hdfc_123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement fra=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'] "));
		driver.switchTo().frame(fra);
		Thread.sleep(3000);
		
		//list of pics in a gallary
	List<WebElement> gallery=driver.findElements(By.xpath("//*[@id='gallery']/li"));
	int length=gallery.size();
		System.out.println(length);
		for(int i=length;i>=1;i--)
		{
			WebElement src=driver.findElement(By.xpath("//*[@id='gallery']/li["+i+"]"));
			WebElement des=driver.findElement(By.xpath("//*[@id='trash']"));
			Actions act=new Actions(driver);
			//Thread.sleep(2000);
			act.dragAndDrop(src, des).build().perform();
			
		}
		
		//driver.close();
		/*
		
		WebElement src2=driver.findElement(By.xpath("//*[@alt='The chalet at the Green mountain lake']"));
		
		WebElement src3=driver.findElement(By.xpath("//*[@alt='Planning the ascent']"));
		
		WebElement src4=driver.findElement(By.xpath("//*[@alt='On top of Kozi kopka']"));
		
		WebElement des=driver.findElement(By.xpath("//*[@id='trash']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(src1, des).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(src2, des).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(src3, des).build().perform();
		Thread.sleep(3000);
		act.moveToElement(src4).clickAndHold().moveToElement(des).release().build().perform(); 
		*/
	}

}
