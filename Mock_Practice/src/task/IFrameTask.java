package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IFrameTask 
{
	String path="E:\\VelocityTraining\\SetUp\\ChromeDriver_Selenium\\chromedriver.exe";
	String key="webdriver.chrome.driver";
	public WebDriver driver;
	public void BrowserLaunch()
	{
		System.setProperty(key, path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void taskDragAndDrop()
	{
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop");
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		WebElement img1=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		//WebElement zoom=driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]/a[1]"));
		//zoom.click();
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(img1, trash).perform();
	}
	public void dropDown()
	{
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown= driver.findElement(By.xpath("//select"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("India");
	}
	public static void main(String[] args) 
	{
		IFrameTask frame=new IFrameTask();
		frame.BrowserLaunch();
		//frame.taskDragAndDrop();
		frame.dropDown();
	}
}
