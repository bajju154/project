package hdfc_123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demoqa {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("kiran");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("d");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[.='Male']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9874563210");
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
		System.out.println(e.getAttribute("value"));
		e.click();
		Thread.sleep(3000);
		//Select dat=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		//dat.selectByValue("February");
		WebElement e1=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Actions act=new Actions(driver);
		act.moveToElement(e1).click().build().perform();
		//Thread.sleep(3000);
		Select mon=new Select(e1);
		mon.selectByVisibleText("February");
		WebElement e2=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		act.moveToElement(e2).click().build().perform();
		//Thread.sleep(3000);
		Select year=new Select(e2);
	year.selectByVisibleText("1992");
	driver.findElement(By.xpath("//div[.='1']")).click();
	
	WebElement k= driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
	System.out.println(k.getAttribute("type"));
	Thread.sleep(2000);
	act.moveToElement(k).click().sendKeys("maths").build().perform();
	Thread.sleep(2000);
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	//System.out.println(driver.findElements(By.xpath("//*[@id=\\\"subjectsInput\\\"]")).size());
	//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"))).click().build().perform();
	Thread.sleep(3000);
	//k.sendKeys("M");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@for='hobbies-checkbox-3']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='uploadPicture']")).sendKeys("C:\\Users\\DELL\\Desktop\\diff bug and defect.PNG");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Kiran studied B.Tech he is looking for good QA position in MNC company at Hyderabad");
		
		//act.moveToElement(driver.findElement(By.xpath("(//select/option[2])[1]"))).click().build().perform();
		
		//e.clear();
		//e.clear();
		//driver.findElement(By.xpath("")).sendKeys("Maths");
		
	}

}
