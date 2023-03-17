package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver = new ChromeDriver(options);
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\Lenovo-T440\\Desktop\\Semestre 5\\Framework JSF\\exojsf\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\chromedriver_win32\\chromedriver.exe");  
		WebDriverManager.chromedriver().setup();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath( "//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath( "//*[@id=\"gh-btn\"]")).click();
		driver.close();

	}

}
