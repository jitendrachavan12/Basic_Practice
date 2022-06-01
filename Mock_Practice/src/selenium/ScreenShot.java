package selenium;

import java.io.IOException;

public interface ScreenShot 
		{
	
		String key = "webdriver.chrome.driver";
		//String value ="D:\\VelocityTraning\\Setups\\ChromeDrdriver_win32\\chromedriver.exe";
		String value = "E:\\VelocityTraining\\SetUp\\ChromeDriver_Selenium\\chromedriver.exe";
		String URL ="https://demo.guru99.com/test/guru99home/";
		public void guru99 () throws IOException, InterruptedException ;
		}

