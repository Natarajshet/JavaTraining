import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleIntroduction {

	public static void main(String[] args) {
		 
		//Invoking the browser
		//Chrome - ChromeDriver -- >Methods() close get 
		//Firefox - FirefoxDriver -- >Methods()
		//Safari - SafariDriver -- >Methods()
		// WebDriver close get
		//WebDriver methods + class methods 
		//Chromedriver.exe-> Chrome browser 
		// Steps to invoke the Chromedrive//
		//Selenium mangaer 
		//System.setProperty("webdriver.chrome.driver","E:\\Study 2024\\Selenium-Notes\\Softwares\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		System.out.println("Launching CHROME BROWSER");
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		driver.quit();
	}

}
