package hdfc_123;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:\\facebook.com");
	FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\masterexe.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
                //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
                //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	int rowcount=sheet.getLastRowNum();
	//System.out.println(rowcount);
	for(int i=1;i<rowcount+1;i++)
	{
		Row r=sheet.getRow(i);
	 int cellcount=r.getLastCellNum();
	//System.out.println(cellcount);
	for(int j=1;j<cellcount;j++)
	{
		Cell c=r.getCell(j);
		String s1=c.getStringCellValue();
		System.out.println(s1);
		System.out.println("  ");
		if(s1.equalsIgnoreCase("y"))
		{
			r.createCell(2).setCellValue("pass");
		}
		else
		{
			r.createCell(2).setCellValue("fail");
		}
		
			
	
	}
	}
	
		//Row row = sheet.getLastRow(0);
	//Cell cell = row.getCell(0);
               	//System.out.println(cell);
	//System.out.println(sheet.getRow(0).getCell(0));
	//String cellval = cell.getStringCellValue();
	//System.out.println(cellval);
	
}		
}
