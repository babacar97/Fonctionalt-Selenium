package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethodes {
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
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Testing");
		
		//clear permet d'effacer
		driver.findElement(By.name("q")).clear();
		
		//getAttribute permet de trouvet d'autre information sur un element donné
		System.out.println(driver.findElement(By.name("q")).getAttribute("class"));
		
		//getCssValue permet d'obtient la valeur d'une propriété CSS de cet élément.
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getCssValue("display"));
		
		//getsize renvoi la dimension du  fenetre courant
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).getSize());
		
		//getLocation renvoie  Où se trouve sur la page le coin supérieur gauche de l'élément rendu ?
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).getLocation());
		
		//Renvoie du texte que contient l'element
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getText());
		
		//getTagname renvoi le nom de la balise contenant l'element testé
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getTagName());
		
		//isDisplayed nous dit si  Cet élément est-il affiché ou non
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isDisplayed());
		
		//L'élément est-il actuellement activé ou non
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isEnabled());
		
		//Déterminez si cet élément est sélectionné ou non.
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isSelected()); 
		
		

	}

}
