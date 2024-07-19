package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base
{
	public void dropdown()
	{
		WebElement inputform = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement selectinput = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectinput.click();
		
		WebElement dropdown1 = driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdown1);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Red");
		select.selectByIndex(1);
	}

	public static void main(String[] args) 
	{
		DropDown obj = new DropDown();
		obj.intialiseBrowser();
		obj.dropdown();

	}

}
