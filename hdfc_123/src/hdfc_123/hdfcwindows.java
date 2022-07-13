package hdfc_123;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class hdfcwindows {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Thread.sleep(3000);
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		// driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.manage().window().maximize();
		driver.navigate().refresh();
		int e = driver.findElements(By.tagName("frame")).size();
		System.out.println(e);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9966123808");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		driver.findElement(By.linkText("Forgot Password / IPIN")).click();

		driver.findElement(By.linkText("Click here")).click();

		driver.findElement(By.xpath("/html/body/p[2]/a[2]")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		System.out.println(windows);

		List<String> win = new ArrayList<>(windows);
		System.out.println("Total window number: " + win.size() + "\n");

		driver.switchTo().window(win.get(1));

		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(win.get(0));

		System.out.println(driver.getTitle());

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//a)[1]")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("(//a)[4]")).click();

		Set<String> wind = driver.getWindowHandles();
		System.out.println(wind);
		System.out.println(wind.size());

		List<String> wi = new ArrayList<>(wind);
		System.out.println("Total window number: " + wi.size() + "\n");

		driver.switchTo().window(wi.get(1));

		System.out.println(driver.getTitle());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)", "");

		driver.findElement(By.xpath("//span[.='Loans On Credit Card EMI Calculator']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		Set<String> wind2 = driver.getWindowHandles();

		System.out.println(wind2);
		System.out.println(wind2.size());
		List<String> wi2 = new ArrayList<>(wind2);

		System.out.println("Total window number: " + wi2.size() + "\n");

		driver.switchTo().window(wi2.get(2));
		System.out.println(driver.getTitle());

		WebElement k = driver.findElement(By.xpath("//select[@id='loanType']"));
		Select loantype = new Select(k);
		loantype.selectByVisibleText("SmartEMI");

		WebElement l = driver.findElement(By.xpath("//input[@id='loanAmount']"));
		l.clear();
		l.sendKeys("30000");

		WebElement m = driver.findElement(By.xpath("//select[@id='rateType']"));
		Select intrest = new Select(m);
		intrest.selectByVisibleText("per annum");

		WebElement n = driver.findElement(By.xpath("//input[@id='inteRate']"));
		n.clear();
		n.sendKeys("3");

		WebElement tensure = driver.findElement(By.xpath("//select[@id='tenureMonths']"));
		Select annuam = new Select(tensure);
		annuam.selectByVisibleText("12");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1600)", "");

		driver.findElement(By.xpath("//input[@id='loan-booking-date']")).click();

		WebElement Calmon = driver.findElement(By.xpath("(//select)[5]"));
		Select calmon = new Select(Calmon);
		calmon.selectByVisibleText("Aug");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("(//select)[6]"));
		Select calyear = new Select(year);
		calyear.selectByVisibleText("2023");

		driver.findElement(By.xpath("(//table)[3]/tbody/tr[3]/td[5]")).click();

		driver.findElement(By.xpath("//input[@id='statement-date']")).click();

		WebElement Calmon1 = driver.findElement(By.xpath("(//select)[5]"));
		Select calmon1 = new Select(Calmon1);
		calmon1.selectByVisibleText("Aug");

		WebElement year1 = driver.findElement(By.xpath("(//select)[6]"));
		Select calyear1 = new Select(year1);
		calyear1.selectByVisibleText("2024");

		driver.findElement(By.xpath("(//table)[3]/tbody/tr[3]/td[5]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		List<WebElement> Month = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		List<WebElement> StartingPrincipalBalance = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		List<WebElement> PrincipalAmount = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		List<WebElement> InterestAmount = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		List<WebElement> EMI = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		List<WebElement> GST = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		List<WebElement> EMIGST = driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
		List<WebElement> EndingPrincipalBalance = driver.findElements(By.xpath("//table/tbody/tr/td[8]"));

		int size1 = Month.size();
		int size2 = StartingPrincipalBalance.size();
		int size3 = PrincipalAmount.size();
		int size4 = InterestAmount.size();
		int size5 = EMI.size();
		int size6 = GST.size();
		int size7 = EMIGST.size();
		int size8 = EndingPrincipalBalance.size();

		System.out.println(size1 + " " + "\n");
		System.out.println(size2 + " " + "\n");
		System.out.println(size3 + " " + "\n");
		System.out.println(size4 + " " + "\n");
		System.out.println(size5 + " " + "\n");
		System.out.println(size6 + " " + "\n");
		System.out.println(size7 + " " + "\n");
		System.out.println(size8 + " " + "\n");
		/*
		 * List<String> strings = new ArrayList<String>(); for(WebElement m1 : emi){
		 * strings.add(m1.getText()); }
		 * 
		 * List<String> strings1 = new ArrayList<String>(); for(WebElement m2 :
		 * startpri){ strings1.add(m2.getText()); }
		 */
		/*
		 * { System.out.println(strings1 + " " + strings); }
		 */

		for (int i = 0; i < size2; i++) {
			String s1 = Month.get(i).getText();
			String s2 = StartingPrincipalBalance.get(i).getText();
			String s3 = PrincipalAmount.get(i).getText();
			String s4 = InterestAmount.get(i).getText();
			String s5 = EMI.get(i).getText();
			String s6 = GST.get(i).getText();
			String s7 = EMIGST.get(i).getText();
			String s8 = EndingPrincipalBalance.get(i).getText();

			System.out.println(
					s1 + " | " + s2 + " | " + s3 + " | " + s4 + " | " + s5 + " | " + s6 + " | " + s7 + " | " + s8);

		}

	}

}
