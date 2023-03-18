package ui;

import java.util.Set;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasculementFenetreWindows {

	public static void main(String[] args )throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.salesforce.com/au/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a"));
	Set<String> Windowhandles = driver.getWindowHandles();
	System.out.println(Windowhandles);
	
	Iterator<String> iterator = Windowhandles.iterator();
	String parentWindow = iterator.next();
	String childWindow = iterator.next();
	

	driver.switchTo().window(childWindow);
	
	driver.findElement(By.name("UserFirstName")).sendKeys("baba");
	driver.findElement(By.name("UserLastName")).sendKeys("ndiaye");
	
	} 
}
