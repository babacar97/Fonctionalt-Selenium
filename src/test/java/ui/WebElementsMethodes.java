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
		
		//getAttribute permet de trouvet d'autre information sur un element donn�
		System.out.println(driver.findElement(By.name("q")).getAttribute("class"));
		
		//getCssValue permet d'obtient la valeur d'une propri�t� CSS de cet �l�ment.
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getCssValue("display"));
		
		//getsize renvoi la dimension du  fenetre courant
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).getSize());
		
		//getLocation renvoie  O� se trouve sur la page le coin sup�rieur gauche de l'�l�ment rendu ?
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).getLocation());
		
		//Renvoie du texte que contient l'element
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getText());
		
		//getTagname renvoi le nom de la balise contenant l'element test�
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).getTagName());
		
		//isDisplayed nous dit si  Cet �l�ment est-il affich� ou non
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isDisplayed());
		
		//L'�l�ment est-il actuellement activ� ou non
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isEnabled());
		
		//D�terminez si cet �l�ment est s�lectionn� ou non.
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input ")).isSelected()); 
		
		

	}

}
