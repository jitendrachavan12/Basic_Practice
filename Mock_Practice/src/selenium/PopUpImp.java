package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpImp implements PopUpInt
{
	public void popup() throws InterruptedException
	{
		System.setProperty(key, value);
		WebDriver d=new ChromeDriver();
		//d.get(URL);
		d.navigate().to(URL);
		d.manage().deleteAllCookies();
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		d.switchTo().alert().accept();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		//d.switchTo().alert().sendKeys("Amol Ballal is Very Cleaver");
		//Thread.sleep(3000);
		d.switchTo().alert().accept();
		
	}

}
