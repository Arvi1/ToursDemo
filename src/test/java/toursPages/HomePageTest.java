package toursPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomePageTest {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("http://newtours.demoaut.com/");
  }
  
  @Test
  public void Login() {
	  driver.findElement(By.linkText("Flights")).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.linkText("Car Rentals")).click();
	  System.out.println(driver.getTitle());
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
