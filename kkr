package Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class Elixir_loginTest {
	
	WebDriver driver;
  public void login() {
	  driver.findElement(By.id("UserLogin_username")).sendKeys("admin");
	  driver.findElement(By.id("UserLogin_password")).sendKeys("admin");
	  driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/form/div[4]/input")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/a")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).sendKeys("medplus");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).sendKeys("Mutyalapalem");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).sendKeys("1991");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).sendKeys("India");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).sendKeys("Andhra Pradesh");
	  driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).clear();
	  driver.findElement(By.xpath("//*[@id="Hospitalregistration_phone\"]")).sendKeys("1234567890");
  }
   

@BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demo.elixiraid.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
