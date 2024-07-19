package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base
{
	public void draganddrop()
	{
		WebElement others = driver.findElement(By.id("others"));
		others.click();
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop = driver.findElement(By.id("mydropzone"));
		Actions actions= new Actions(driver);
		actions.dragAndDrop(drag1, drop).perform();
	}
	

	public static void main(String[] args) 
	{
		DragAndDrop obj = new DragAndDrop();
				obj.intialiseBrowser();
		obj.draganddrop();

	}

}
