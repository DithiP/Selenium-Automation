package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleProgram 
{
	WebDriver driver;
	public void add()
	{
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
	}

	public static void main(String[] args) 
	{
		SampleProgram obj = new SampleProgram();
		obj.add();

	}

}
