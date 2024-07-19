package sample;

public class NavigateCommands extends Base 
{
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) 
	{
		NavigateCommands obj1 = new NavigateCommands();
		obj1.intialiseBrowser();
		obj1.navigateCommands();

	}

}
