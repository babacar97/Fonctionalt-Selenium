package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		WebDriver driver = new ChromeDriver(options);
		WebDriverManager.chromedriver().setup();*/
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		//Ici on recupere le text qui est sur le button hello puis on l'afffiche sur le console
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		//ici on accepte le popput
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//ici on recupere le titre de la page
		System.out.println(driver.getTitle());
		
		
		
	}

}
