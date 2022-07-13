package hdfc_123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		WebElement str=driver.findElement(By.xpath("//li[.='UserID : 1303']"));
		String uname=str.getText();
		System.out.println(uname);
		String str1=uname;
        String[] arrOfStr = str1.split(": ", 2);
 
        for (String a : arrOfStr)
            System.out.println(a);
        
        System.out.println(arrOfStr[1]);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(arrOfStr[1]);
        WebElement str2=driver.findElement(By.xpath("//li[.='Password : Guru99']"));
        String passwrd=str2.getText();
		System.out.println(passwrd);
		String str3=passwrd;
        String[] arr = str3.split(": ", 2);
 
        for (String b : arr)
            System.out.println(b);
        System.out.println(arr[1]);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);
        driver.findElement(By.xpath("//input[@name='btnLogin'] ")).click();
    	
        
        

	}

}
