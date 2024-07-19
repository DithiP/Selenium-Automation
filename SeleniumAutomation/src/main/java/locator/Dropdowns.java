package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns 
{
	public WebDriver driver;
	public void initialise()
	{

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	
	public void dropdown1()
	{
		WebElement menu1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(menu1);
		select.selectByVisibleText("Python");
		
	}
	
	public void dropdown2()
	{
		WebElement menu2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select select = new Select(menu2);
		select.selectByVisibleText("TestNG");
		
	}
	

	public void dropdown3()
	{
		WebElement menu3 = driver.findElement(By.id("dropdowm-menu-3"));
		Select select = new Select(menu3);
		select.selectByVisibleText("JQuery");
		
	}

	public static void main(String[] args) 
	{
		Dropdowns obj = new Dropdowns();
				obj.initialise();
		obj.dropdown1();
		obj.dropdown2();
		obj.dropdown3();
		
	}

}
