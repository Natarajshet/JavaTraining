import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","E:\\Study 2024\\Selenium-Notes\\Softwares\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching CHROME BROWSER");
		driver.get("https://rahulshettyacademy.com");
		  driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();

		//Firefox launch
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver","E:\\Study 2024\\\\Selenium-Notes\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("Launching Firefox BROWSER");
		//System.out.println(driver2.getCurrentUrl());
		driver2.get("https://rahulshettyacademy.com");
		driver2.manage().window().maximize();
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		//driver2.close();
		//driver2.quit();
		
		//MicrosoftEdge launch
		//webdriver.edge.driver
		//System.setProperty("webdriver.edge.driver","E:\\Study 2024\\\\Selenium-Notes\\Softwares\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		System.out.println("Launching MICROSOFT Edge BROWSER");
		driver3.get("https://rahulshettyacademy.com");
		  driver3.manage().window().maximize();
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		//driver.close();
		//driver3.quit();
		}};

