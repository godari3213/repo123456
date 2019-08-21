package cucumber1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading 
{
	@Test
	public void test() 
		
	{
    WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C://Drivers//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");	
	System.out.println("driver.getTitle()");
	driver.findElement(By.linkText("Cruises")).click();
	List<WebElement> t_rows= driver.findElements(By.tagName("tr"));
	System.out.println("number of rows" +t_rows.size());
	for(WebElement row : t_rows)
	{ 
		List<WebElement> t_col= row.findElements(By.tagName("td"));
		//System.out.println(row.getText());
		for (WebElement col : t_col)
			if(col.getText().equalsIgnoreCase("Sat"));
		System.out.println(row.getText());
		
	}
}

}