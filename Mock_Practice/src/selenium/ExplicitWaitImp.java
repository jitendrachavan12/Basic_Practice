package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitImp implements ExplicitWaitInt
{
public void methods() throws InterruptedException
{
	WebDriver d = new ChromeDriver();

	// Step 1 : Creating of WebDriverWait
	WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	//d.navigate().to("https://paytm.com/recharge");
	//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	// Explicit Wait = Waiting Time + Condition
	// Step 2 : checking the condition using until 

	WebElement dth;
	dth = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='DTH']")));
	dth.click();
	Thread.sleep(2000);
	d.quit();
}
}
