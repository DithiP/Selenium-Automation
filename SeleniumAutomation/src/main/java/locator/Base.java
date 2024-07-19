package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import sample.Base;

public class Base 
{
	public WebDriver driver;
	public void intialiseBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
	public void driverQuit()
	{
		driver.close();
	}


	public static void main(String[] args) 
	{
		Base obj = new Base();
		obj.intialiseBrowser();
		//obj.driverQuit();

	}

}
