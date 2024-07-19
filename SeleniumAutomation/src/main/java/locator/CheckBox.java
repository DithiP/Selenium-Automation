package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{
	public WebDriver driver;
	public void initialise()
	{

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	public void checkbox()
	{
		WebElement option = driver.findElement(By.xpath("//input[@value='option-4']"));
		//option.click();
		System.out.println(option.isSelected());
		
	}

	public static void main(String[] args) 
	{
		CheckBox obj = new CheckBox();
				obj.initialise();
		obj.checkbox();

	}

}
