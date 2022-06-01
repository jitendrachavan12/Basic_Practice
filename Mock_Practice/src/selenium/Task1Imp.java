package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Imp implements Task1Interface
{
	static WebDriver d;
	public void browserLauncher()
	{
		System.setProperty(key, value);
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}
	public void first() throws InterruptedException
	{
		Thread.sleep(1500);
		d.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		String pid=d.getWindowHandle();
		Set<String> pcid=d.getWindowHandles();
		System.out.println(pid);
		System.out.println(pcid);

		for(String ch:pcid)
		{		
			if(!(pid.equals(ch)))
			{
				d.switchTo().window(ch);
				d.findElement(By.xpath("//input[@name='q']")).sendKeys("Pune");
				Thread.sleep(3000);
				d.findElement(By.xpath("//input[@name='btnK']")).click();
				Thread.sleep(5000);
				d.close();
				d.switchTo().window(pid);
				d.findElement(By.xpath("//a[@class='post-count-link']")).click();
				Thread.sleep(5000);
				d.navigate().back();
			}
		}
	}
	public void second() throws InterruptedException
	{
		d.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com')]")).click();
		String pid=d.getWindowHandle();
		Set<String> pcid=d.getWindowHandles();
		for(String ch:pcid)
		{
			if(!pid.equals(ch))
			{
				d.switchTo().window(ch);
				d.findElement(By.xpath("//input[@id='email']")).sendKeys("mayurdhopte007@gmail.com");
				Thread.sleep(1500);
				d.findElement(By.xpath("//input[@id='pass']")).sendKeys("1101320294");
				Thread.sleep(1500);
				d.findElement(By.xpath("//button[@name='login']")).click();
				Thread.sleep(10000);
				d.manage().deleteAllCookies();
				d.close();
				d.switchTo().window(pid);
				d.findElement(By.xpath("//a[contains(text(),'2021')]")).click();
				d.navigate().back();
				d.switchTo().window(pid);
			}
		}

	}
	public void third() throws InterruptedException
	{
		d.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		String pid=d.getWindowHandle();
		Set<String> pcid=d.getWindowHandles();
		for(String ch:pcid)
		{
			if(!pid.equals(ch))
			{
				d.switchTo().window(ch);
				d.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Testing Job in pune");
				Thread.sleep(3000);
				d.findElement(By.xpath("//button[@type='submit']")).click();
				d.close();
				d.switchTo().window(pid);
				d.findElement(By.xpath("//a[contains(text(),'2019')]")).click();
				Thread.sleep(3000);
				d.navigate().back();
			}
		}
	}
	public void fourth() throws InterruptedException
	{
		d.findElement(By.xpath("//a[contains(text(),' Click this link to start  Session in same window')]")).click();
		Thread.sleep(1500);
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("mayurdhopte007@gmail.com");
		Thread.sleep(1500);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("1101320294");
		Thread.sleep(1500);
		d.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		d.navigate().back();
		d.navigate().back();
		d.findElement(By.xpath("//a[contains(text(),'2018')]")).click();
		Thread.sleep(1500);
		d.navigate().back();
		d.close();
	}
	public void facebook()
	{
		WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("11");
		WebElement month=d.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("7");
		WebElement year=d.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1990");
		
	}
}
