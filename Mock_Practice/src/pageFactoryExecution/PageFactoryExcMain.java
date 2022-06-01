package pageFactoryExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryExcMain implements PageFactoryExcInterface
{
	public static void main(String[] args)
	{
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get(path);
		driver.manage().window().maximize();
	}
}
