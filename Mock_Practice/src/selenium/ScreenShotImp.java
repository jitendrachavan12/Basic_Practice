package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotImp implements  ScreenShot {



	public void guru99() throws IOException, InterruptedException  {
		System.setProperty(key, value);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(URL);
		Thread.sleep(1500);
		JavascriptExecutor j = ((JavascriptExecutor)d);
		j.executeScript("scroll(0, 2100)");
		Thread.sleep(1500);
		d.switchTo().frame("a077aa5e");
		d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		String pid =d.getWindowHandle();
		Set<String> pid2 = d.getWindowHandles();

		for(String ch:pid2) {
			if(!pid.equals(ch)) {
				d.switchTo().window(ch);
				WebElement logo = d.findElement(By.xpath("//img[@class='custom-logo']"));
				String Path1 = "E:\\VelocityTraining\\ScreenShot\\logo1.png";
				File src = logo.getScreenshotAs(OutputType.FILE); 
				File dest = new File(Path1);
				FileHandler.copy(src, dest);
				//Thread.sleep(3000);
				d.close();

			}
			if(pid.equals(ch)) {
				
				d.switchTo().window(ch);
				String Path2 = "E:\\VelocityTraining\\ScreenShot\\logo2.png";
				WebElement logo2 = d.findElement(By.xpath("//img[@src='images/logo_1.png']"));
				File src1 = logo2.getScreenshotAs(OutputType.FILE);
				File dest2 = new File(Path2);
				FileHandler.copy(src1, dest2);

			}
		}
	//	d.quit();
		/*for(String ch1:pid2) {
				if(pid.equals(ch1)) {
					d.switchTo().window(ch1);
					String Path2 = "D:\\VelocityTraning\\guru999.png";
					WebElement logo2 = d.findElement(By.xpath("//img[@src='images/logo_1.png']"));
					File src1 = logo2.getScreenshotAs(OutputType.FILE);
					File dest2 = new File(Path2);
					FileHandler.copy(src1, dest2);

				}
			}*/			
	}
}

