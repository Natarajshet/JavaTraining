import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


public class MsEdgeLaunch {

	public static void main(String[] args) {
		 
		//Invoking the browser
		 
		//Firefox - FirefoxDriver -- >Methods()
		//Safari - SafariDriver -- >Methods()
		// WebDriver close get
		//WebDriver methods + class methods 
		//Chromedriver.exe-> Chrome browser 
		// Steps to invoke the Chromedrive//
		//Selenium mangaer 
		
		System.setProperty("webdriver.edge.driver","E:\\Selenium-Notes\\Softwares\\msedgedriver.exe");
		 
		//MicrosoftEdge launch
		//webdriver.edge.driver
		WebDriver driver = new EdgeDriver();
		System.out.println("Launching MICROSOFT EDGE BROWSER");
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		driver.quit();
	}

}