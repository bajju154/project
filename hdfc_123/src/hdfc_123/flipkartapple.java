package hdfc_123;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkartapple {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))).click().build().perform();
	WebElement e=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	e.sendKeys("apple");
	
	Thread.sleep(3000);
	
	List<WebElement>  list=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	int listsize=list.size();
	for(int l=0;l<listsize;l++)
	{
		String li=list.get(l).getText();
		System.out.println(li);
	}
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	System.out.println(driver.getTitle());

	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	/* Set<String> windows=driver.getWindowHandles();
	System.out.println(windows);
	System.out.println(windows.size());
	List<String> win = new ArrayList<>(windows);
	driver.switchTo().window(win.get(1));
	 */ 
	
		
	System.out.println(driver.getTitle());
	
	//System.out.println(driver.getTitle());
	List<WebElement> items=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	int size=items.size();
	System.out.println(size);
	
	List<WebElement> pri=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	int count=pri.size();
	System.out.println(count);
	
	for(int i=0;i<size;i++)
	{
		String item=items.get(i).getText();
		String price=pri.get(i).getText();
		System.out.println("Mobile Name:-"+item+ "     Price of the Mobile:RS"+price);
		  
	}
	
	
	
	
	
	
	}

}
