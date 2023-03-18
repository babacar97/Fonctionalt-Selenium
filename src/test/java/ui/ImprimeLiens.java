package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImprimeLiens {
	
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
		
		driver.get("https://www.sugarcrm.com/uk/request-demo/");
		driver.manage().window().maximize();
		//Ce bout de code permet de connaitre le nombre de lien dands une page donnné
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("le nombre de lien est de :"+alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("le nombre de lien est de :"+alltags.get(i).getAttribute("href"));
			System.out.println("le nombre de lien est de :"+alltags.get(i).getText());
		}
	}

}
