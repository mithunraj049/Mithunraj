package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {
	
	public static WebDriver driver;
	static String appURL = "http://google.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get(appURL);
		
		//driver.navigate().to(appURL);
		//String getTitle = driver.getTitle();
		
		driver.quit();
		
	}

}
