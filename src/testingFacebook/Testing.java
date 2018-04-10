package testingFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Medhat/Programming/Software Engineering/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("myusernameMedhat");
		driver.findElement(By.id("pass")).sendKeys("mypassword");
		driver.findElement(By.id("u_0_2")).click();
		
		
	}
	
}
