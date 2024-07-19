package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends Base
{
	public void findelements()
	{
		WebElement inputform = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		List<WebElement> elementes = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement option:elementes)
		{
			option.sendKeys("hello");
		}
	}

	public static void main(String[] args) 
	{
		FindElementsExample obj = new FindElementsExample();
		obj.intialiseBrowser();
		obj.findelements();

	}

}
