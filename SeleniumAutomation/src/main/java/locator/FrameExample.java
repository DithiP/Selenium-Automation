package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample 
{
	WebDriver driver;
	public void frameEx()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement jmeter = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		jmeter.click();
	}

	public static void main(String[] args) 
	{
		FrameExample obj = new FrameExample();
		obj.frameEx();

	}

}
