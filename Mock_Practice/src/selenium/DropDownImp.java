package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownImp implements DropDownInt
{
	public void dropdown()
	{
		System.setProperty(key, value);
		WebDriver d=new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		WebElement day=d.findElement(By.xpath("//select[@id='day']"));
		Select sd=new Select(day);
		sd.selectByIndex(1);
		WebElement month=d.findElement(By.xpath("//select[@id='month']"));
		Select sm=new Select(month);
		sm.selectByValue("8");
		WebElement year=d.findElement(By.xpath("//select[@id='year']"));
		Select sy=new Select(year);
		sy.selectByVisibleText("1996");
	}
}
