package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethodes {

	
	public static String browser ="chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable notifications");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	
		
			
	   //Ouvrir un site donné
		driver.get("https://www.saucedemo.com/");
		//Agrandir la fenetre du navigateurs
		driver.manage().window().maximize();
		
		//Recupere l'url d'une site donné
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Recuperer le titre d'une page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String pagesources = driver.getPageSource();
		System.out.println(pagesources);
		
		//Naviguer sur un site donné
		driver.navigate().to("");
		
		//Ferme le navigateur
		driver.close();
		
		//fermer la fenetre
		driver.quit();
		
		

	}

}
