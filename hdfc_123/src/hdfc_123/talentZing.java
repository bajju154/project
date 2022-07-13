package hdfc_123;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class talentZing {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.talentzing.com");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[.='Register']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul/li/div/ul/li/a)[9]")).click();
		System.out.println(driver.getTitle());
		Set<String>  window=driver.getWindowHandles();
		System.out.println(window);
		List<String> win=new ArrayList<>(window);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtfirstname']")).sendKeys("Prasad");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtlastname']")).sendKeys("Nandivada");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtemail']")).sendKeys("prasad123@outlook.in");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtmobile']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtLandline']")).sendKeys("08692568585");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtpwd']")).sendKeys("prasa123");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']")).sendKeys("prasa123");
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_ddlFresherLocation']")));
		dropdown.selectByVisibleText("Vijayawada");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_rdoGender_0']")).click();
		WebElement web=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtdateOfBirth']"));
		web.click();
		web.sendKeys("28/07/1996");
		Select drop=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlEducation']")));
		drop.selectByVisibleText("BE/B.Tech");
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCollegeName']")).sendKeys("R K C E");
		Select passyear=new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_ddlyop']")));
		passyear.selectByVisibleText("2013");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_txtkeywords']")).sendKeys("Java,C++,C");
		
		/*   Upload a file using Robot class
		
		act.click(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_flUpdResume']"))).build().perform();
		Thread.sleep(3000);
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
		
		*/
		
		
		
		
		
		//Upload a file directly by using sendKeysmethod 
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_flUpdResume']")).sendKeys("C:\\Users\\DELL\\Desktop\\compines.docx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_flUpdPhoto']")).sendKeys("C:\\Users\\DELL\\Desktop\\diff bug and defect.PNG");
		driver.findElement(By.xpath("//*[@id='chkEmailjobs']")).click();
		driver.findElement(By.xpath("//*[@id='chkTrainingEmail']")).click();
		driver.findElement(By.xpath("//*[@id='chkAccept']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder2_btnSubmit']")).click();
		
	}

}
