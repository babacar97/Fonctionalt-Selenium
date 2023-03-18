package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("//*[@name='book-flight-radio']"));
		radio.click();
		System.out.println(radio.isSelected());

	}
}
