package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitImp implements ImplicitWaitInt
{
	public void displayed()
	{
		System.setProperty(key, value);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		//d.navigate().to("https://paytm.com/recharge");
		d.get(URL);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement logo = d.findElement(By.xpath("//a[@class='wpwl']"));
		boolean result = logo.isDisplayed();
		if (result == true)
		{
			System.out.println("Test Scenario is Passed  " + result);
			logo.click();
		}else
		{
			System.out.println("Test Scenario is Failed  ");
		}
}
}
