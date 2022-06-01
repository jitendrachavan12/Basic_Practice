package selenium;

public interface Task1Interface 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\VelocityTraining\\SetUp\\ChromeDriver_Selenium\\chromedriver.exe";
		//String url="http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html";
		String url="https://www.facebook.com/signup";
		public void first()  throws InterruptedException;
		public void second() throws InterruptedException;
		public void third() throws InterruptedException;
		public void fourth() throws InterruptedException;
	}
