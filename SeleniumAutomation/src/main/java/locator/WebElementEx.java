package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementEx extends Base
{
	public void webelement()
	{
		WebElement inputform = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		
		WebElement message = driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello World");
		
		WebElement send = driver.findElement(By.id("button-one"));
		send.click();
		//return text field
		System.out.println(send.getText());
		
		WebElement value1 = driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2 = driver.findElement(By.id("value-b"));
		value2.sendKeys("20");
		WebElement total = driver.findElement(By.id("button-two"));
		total.click();
	}

	public static void main(String[] args) 
	{
		WebElementEx obj = new WebElementEx();
		obj.intialiseBrowser();
		obj.webelement();

	}

}
