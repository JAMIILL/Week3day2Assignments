package Week3day2Assignments;


	


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	

	public static void main(String args[])
	{
		  WebDriverManager.chromedriver().setup();
	        ChromeOptions option=new ChromeOptions();
	        // to turn of the notifications
	        option.addArguments("--disable-notifications");
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.snapdeal.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        WebElement element = driver.findElement(By.linkText("Men's Fashion"));
	        Actions builder=new Actions(driver);
	        builder.moveToElement(element).perform();
	        driver.findElement(By.className("linkTest")).click();
	        
	        String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	        System.out.println("Sports Shoes Count" + text);
	       
	     
}}