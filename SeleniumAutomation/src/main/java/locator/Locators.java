package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
	public void idLocator()
	{
		WebElement id = driver.findElement(By.id("single-input-field"));
		WebElement id1 = driver.findElement(By.id("value-a"));
		WebElement id2 = driver.findElement(By.id("value-b"));
		WebElement id3 = driver.findElement(By.id("button-two"));
		WebElement id4 = driver.findElement(By.id("message-two"));
		
		WebElement class1 = driver.findElement(By.className("clearfix"));
		WebElement class2 = driver.findElement(By.className("form-control datepicker"));
		WebElement class3 = driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
		WebElement class4 = driver.findElement(By.className("ui-button ui-corner-all ui-widget"));
		WebElement class5 = driver.findElement(By.className("card-body"));
		
		WebElement name = driver.findElement(By.name("viewport"));
		WebElement name1 = driver.findElement(By.name("description"));
		WebElement name2 = driver.findElement(By.name("keywords"));
		WebElement name3 = driver.findElement(By.name("author"));
		
		WebElement link = driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement link1 = driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement link2 = driver.findElement(By.linkText("jquery-select.php"));
		WebElement link3 = driver.findElement(By.linkText("date-picker.php"));
		
		
		WebElement partial = driver.findElement(By.partialLinkText("simple-form"));
		WebElement partial1 = driver.findElement(By.partialLinkText("jquery-select"));
		WebElement partial2 = driver.findElement(By.partialLinkText("date-picker"));
		WebElement partial3 = driver.findElement(By.partialLinkText("bootstrap-"));
		
		
		
		}
	//cssSelector
			public void cssselector()
			{
				//tag and id
				//tag#id
				WebElement tagid = driver.findElement(By.cssSelector("input#single-input-field"));
				WebElement tagid1 = driver.findElement(By.cssSelector("input#value-a"));
				WebElement tagid2 = driver.findElement(By.cssSelector("input#value-b"));
				WebElement tagid3 = driver.findElement(By.cssSelector("button#autoclosable-btn-success"));
				
				//tag and class
				//tag.class name
				WebElement tagclass = driver.findElement(By.cssSelector("input.form-control"));
				WebElement tagclass1 = driver.findElement(By.cssSelector("div.my-2"));
				WebElement tagclass2 = driver.findElement(By.cssSelector("div.card-body"));
				WebElement tagclass3 = driver.findElement(By.cssSelector("section.clearfix"));
				
				//tag and attribute
				//tag[attribute type = attribute value]
				WebElement tagattr = driver.findElement(By.cssSelector("input[placeholder=Message]"));
				WebElement tagattr1 = driver.findElement(By.cssSelector("input[id=value-a]"));
				WebElement tagattr2 = driver.findElement(By.cssSelector("input[id=value-b]"));
				
				//tag,class,attribute
				//tag.class[attribute type = attribute value]
				WebElement all = driver.findElement(By.cssSelector("button.navbar-toggler[data-toggle = collapse]"));
				WebElement all1 = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
				WebElement all2 = driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
						
				
	}
			public void xpath()
			{
				//Relative Xpath
				//tag name[@attribute type = 'attribute value']
				WebElement relative1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
				WebElement relative2 = driver.findElement(By.xpath("//input[@id='value-a']"));
				WebElement relative3 = driver.findElement(By.xpath("//button[@data-toggle='collapse']"));
				
				//absolute xpath
				WebElement absolute = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
				WebElement absolute1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
				
				//Dynamic xpath - contains
				WebElement contains1 = driver.findElement(By.xpath("//input[contains(@id,'-a')]"));
				WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
				WebElement contains3 = driver.findElement(By.xpath("//input[contains(@id,'-field']"));
				
				
				//Dynamic xpath - text
				//tag name[text()='text message']
				WebElement text1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
				WebElement text2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
				WebElement text3 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
				
			}
			public void accessmethod()
			{
				//child - //tag name[@attribute type='attribute value']//child::tag name[@attribute type='attribute value']
				WebElement child = driver.findElement(By.xpath(""));
				
				
				//parent - //tag name[@attribute type='attribute value']//parent::parent tag name
				WebElement parent = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
				
				
				//Following - //tag name 
				WebElement following = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
				
				//index- (//tag name[@attribute type='attribute value'])[index]
				WebElement index = driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
				WebElement index1 = driver.findElement(By.xpath("(//div[@class='form-group'])[2]"));
				
			}

	public static void main(String[] args) 
	{
		
	}

}
