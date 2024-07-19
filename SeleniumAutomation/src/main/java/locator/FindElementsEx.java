package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx 
{
	public WebDriver driver;
	public void initialise()
	{

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	
	public void findelements1()
	{
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='option-3']"));
		checkbox3.click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement option:checkbox) 
		{
			option.click();
			
		}
	}

	public static void main(String[] args) 
	{
		FindElementsEx obj = new FindElementsEx();
		obj.initialise();
		obj.findelements1();

	}

}
