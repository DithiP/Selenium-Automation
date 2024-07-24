package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window2 
{

	WebDriver driver;
	public void multipleWindow1()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		WebElement todoList = driver.findElement(By.id("to-do-list"));
		todoList.click();
		
		WebElement buttonClick = driver.findElement(By.id("button-clicks"));
		buttonClick.click();
		
				
		String parentName = driver.getWindowHandle();
		System.out.println(parentName);
		
		Set<String> allWindow =driver.getWindowHandles();
		String title = "";
		for(String tem:allWindow)
		{
			if(!tem.equals(parentName))
			{
				System.out.println("All windows:"+tem);
				driver.switchTo().window(tem);
				System.out.println(driver.getTitle());
				title = driver.getTitle();
			}
			
			if(title.equals("WebDriver | To Do List"))
			{
				WebElement newToDO = driver.findElement(By.xpath("//input[@type='text']"));
				newToDO.sendKeys("New form");
				//WebElement delete = driver.findElement(By.xpath("//i[@class='fa fa-trash']"));
				//delete.click();
				
			}
			
			if(title.equals("WebDriver | Button Clicks"))
			{
				WebElement alert = driver.findElement(By.id("button1"));
				alert.click();
				//driver.switchTo().alert().dismiss();
			}
			
			
		}
	}

	public static void main(String[] args) 
	{
		Multiple_Window2 obj = new Multiple_Window2();
		obj.multipleWindow1();

	}

}
