package modules.Elixir_Project_A_Sravani_batch_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ElixirTest {
	WebDriver driver;
	@BeforeTest
   public void browser_open()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium 3.12.0\\chromedriver.exe");
		driver=new ChromeDriver();
		//to insert url in the browser
		driver.get("http://demo.elixiraid.com/index.php");
		//to maximize the browser window
		driver.manage().window().maximize();
    }
	
	
@Test(priority=0)
  public void login() throws Exception
{
	// wait 3 seconds to open login page
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"UserLogin_username\"]")).sendKeys("admin");
	//wait 3 seconds for password to be entered
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"UserLogin_password\"]")).sendKeys("admin");
  //wait 2 seconds to click on sign-in/log-in button
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/form/div[4]/input")).click();
	  }

@Test(priority=1)
public void hospital_reg() throws Exception
{
	
    //wait for 2 sec to click on settings section(here i am using click command)
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/a")).click();
	//wait for 2 sec to select hospital registration option that is to register(here i am using click command)
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/ul/li[1]/a")).click();
	
	//to clear data in hospital code, here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).clear();
	// to enter hospital code 
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).sendKeys("02");
	
	//to clear data in hospital name, here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).clear();
	// to enter hospital name
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).sendKeys("yashoda hospitals");
	
	//to clear data in address, here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).clear();
	// to enter address
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).sendKeys("hyderabad");
	
	
	//to clear data in year of establishment, here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).click();
	// to enter year of establishment
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).sendKeys("1994");
	
	//to clear data in country, here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).clear();
	// to enter country name
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).sendKeys("india");
	
	//to clear data in state , here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).clear();
	// to enter state name 
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).sendKeys("telangana");
	
	//to clear data in mobile number , here i am using clear command
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).clear();
	// to enter mobile number
	driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).sendKeys("1234563342");
	
	   //to clear data in email section
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).clear();
		// to enter email
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).sendKeys("hello878@gmail.com");
		
		 //to clear data in fax section
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).clear();
		// to enter fax
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).sendKeys("234466");
				
		//to clear data in no. of buildings section
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).clear();
		// to enter no. of buildings
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).sendKeys("6");
	
		//to clear data in contact person
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).clear();
		// to enter name of ther contact person
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).sendKeys("bhavya");
				
		//to clear data in no. of promoted by section
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).clear();
		// to enter name who is promoted
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).sendKeys("tv9");
	
			
	 // to click on save button(use click command here)
		driver.findElement(By.xpath("//*[@id=\"hospitalregistration-form\"]/div[2]/div/div[2]/div[7]/button")).click();
		
	//wait for 5 sec to see the data which is saved
		Thread.sleep(5000);
}

/*@Test(priority=2)
public void pharmacy_mgmt() throws Exception{
    //to click on phar mgmt
	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[9]/a/span")).click();
	Thread.sleep(5000);
	//to click on allvendors
	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[9]/ul/li[2]/a")).click();
	Thread.sleep(10000);
	//to click on view details
	driver.findElement(By.xpath("//html//tr[2]/td[7]/a[1]")).click();
	//wait for dialog box to close
	Thread.sleep(3000);
	//to click on the close icon
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(3000);
}*/
 @AfterTest
  public void logout() {
    	
		//to close the browser window
		driver.quit();
}
}