package hdfc_123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class GetterSetterExample1 {
    
	  
	    // class member variable  
	    private String CurrentPrice; 
	    private String PrevClose;
	    private String Company;  
	    private String Group;  
	    private String Change;  
	  
	    public String getCurrentPrice()   
	    {  
	        return CurrentPrice;  
	    }  
	    public void setCurrentPrice(final String CurrentPrice)   
	    {  
	        this.CurrentPrice = CurrentPrice;  
	    }  
	    
	    
	    public String getPrevClose()   
	    {  
	        return PrevClose;  
	    }  
	    public void setPrevClose(final String PrevClose)   
	    {  
	        this.PrevClose = PrevClose;  
	    }  
	   
	    
	    
	    public String getCompany()   
	    {  
	        return Company;  
	    }  
	    public void setCompany(final String Company)   
	    {  
	        // Validating the employee's name and   
	        // throwing an exception if the name is null or its length is less than or equal to 0.  
	        if(Company == null ||  Company.length() <= 0)   
	        {  
	            throw new IllegalArgumentException();  
	        }  
	        this.Company = Company;  
	    }  
	    public String getGroup()   
	    {  
	        return Group;  
	    }  
	    public void setGroup(final String Group)   
	    {  
	        this.Group = Group;  
	    }  
	    public String getChange()   
	    {  
	        return Change;  
	    }  
	      
	    public void setChange(final String Change)   
	    {  
	        this.Change = Change;  
	    }  
	    // for printing the values  
	    @Override  
	    public String toString()   
	    {  
	    	String str = "Company = " + getCompany() + ", Group = " + getGroup() + ",PrevClose = " + getPrevClose() + ", CurrentPrice = " + getCurrentPrice() + ", Change = " + getChange() +  " "; 
	    	
	       // String str = "CurrentPrice = " + getCurrentPrice() + ", PrevClose = " + getPrevClose() + ",Company = " + getCompany() + ", Group = " + getGroup() + ", Change = " + getChange() + "]";  
	        return str ;  
	    }  
	}  
	// Main class.  
	public class Employee extends GetterSetterExample1
	{  
	    // main method  
	    public static void main(String argvs[])   
	    {  
	    	
	    	String company = null;
	    	String grp=null;
	    	String pre=null;
	    	String cur=null;
	    	String chang=null;
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\workspace\\hdfc_123\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			
	    	
	        // Creating an object of the Employee class  
	        final GetterSetterExample1 emp = new GetterSetterExample1();  
	        
	        List<WebElement> names = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			int size=names.size();
			System.out.println(size);
			for(int i=0;i<size;i++)
			{
				
				  company=names.get(i).getText(); 
				  //System.out.println(company);
			       
			}
			
			List<WebElement> names2 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
			int size1=names.size();
			System.out.println(size1);
			for(int j=0;j<size1;j++)
			{
				
				  grp=names2.get(j).getText(); 
				  
			       
			}
			
			List<WebElement> names3 = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
			int size3=names3.size();
			System.out.println(size3);
			for(int k=0;k<size3;k++)
			{
				
				  pre=names3.get(k).getText(); 
				  
			       
			}
			
			List<WebElement> names4 = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
			int size4=names4.size();
			System.out.println(size4);
			for(int l=0;l<size4;l++)
			{
				
				  cur=names.get(l).getText(); 
				  
			       
			}
			
			List<WebElement> names5 = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
			int size5=names5.size();
			System.out.println(size5);
			for(int m=0;m<size5;m++)
			{
				
				  chang=names5.get(m).getText(); 
				  
			       
			}
			
			
	        // the employee details are getting set using the setter methods.
			emp.setCompany(company);
	         emp.setGroup(grp);
	        emp.setPrevClose(pre);
	        emp.setCurrentPrice(cur);
	        emp.setChange(chang);
	       
	        
	       
	        
	        
	          
	        // Displaying the details of the employee details using the   
	        // 'toString()' method, which uses the getter methods  
	        System.out.println(emp.toString());  
	    }  
	}  
	
	
	
	
	
	/*
	
	
			*/
	