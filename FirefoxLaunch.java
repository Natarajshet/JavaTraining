import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		 
		//Invoking the browser
		 
		//Firefox - FirefoxDriver -- >Methods()
		//Safari - SafariDriver -- >Methods()
		// WebDriver close get
		//WebDriver methods + class methods 
		//Chromedriver.exe-> Chrome browser 
		// Steps to invoke the Chromedrive//
		//Selenium mangaer 
		
		System.setProperty("webdriver.gecko.driver","E:\\Selenium-Notes\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		 
		//Firefox launch
		//webdriver.gecko.driver
		WebDriver driver = new FirefoxDriver();
		System.out.println("Launching FIREFOX BROWSER");
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		driver.quit();
	}

}