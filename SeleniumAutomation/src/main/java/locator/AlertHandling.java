package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{
	public void alert1()
	{
		WebElement alert1 = driver.findElement(By.id("alert-modal"));
		alert1.click();
		WebElement java = driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		java.click();
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button.click();
		driver.switchTo().alert().accept();
				
	}
	
	public void alert2()
	{
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button2.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();	
		
	}
	
	public void alert3()
	{
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		button3.click();
		driver.switchTo().alert().sendKeys("dithi");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

	public static void main(String[] args) 
	{
		AlertHandling obj = new AlertHandling();
		obj.intialiseBrowser();
		obj.alert1();
		obj.alert2();
		obj.alert3();

	}

}
