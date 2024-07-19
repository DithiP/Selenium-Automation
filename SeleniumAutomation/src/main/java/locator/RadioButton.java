package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public WebDriver driver;
	public void initialise()
	{

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	
	public void radiobutton()
	{
		WebElement radio = driver.findElement(By.xpath("//input[@value='green']"));
		//System.out.println(radio.isSelected());
		//System.out.println(radio.isEnabled());
		System.out.println(radio.isDisplayed());
	}

	public static void main(String[] args) 
	{
		RadioButton obj = new RadioButton();
		obj.initialise();
		obj.radiobutton();

	}

}
