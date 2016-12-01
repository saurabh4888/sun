package MWACTH;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ASSEST {
	WebDriver driver;
	
	 
	   @Test
	  public void open() throws Exception{
		   
		   
		    
		   
		  
		    System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
	         
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		    	

			driver.manage().window().maximize();
		
			//driver.get("https://mwatch.mindtree.com/Portal/index.php?r=User/authentication/Login&goto=https%3A%2F%2Fmwatch.mindtree.com%2F");
         driver.get("https://mwatch.mindtree.com/Portal/index.php?r=configuration/CIConfiguration/loadActionWidget&widget=ChangeCICriticality&CIID=154370&title=Change%20Criticality"); 
			driver.findElement(By.id("Login_username")).sendKeys("M1026429@mindtree.com");
			driver.findElement(By.id("password")).sendKeys("Welcome@72");
			driver.findElement(By.id("login_link")).click();
			
			Thread.sleep(500);
			
			driver.findElement(By.id("serld")).click();
			
			Thread.sleep(500);
			
			WebElement element=driver.findElement(By.id("internal_usercustomer")); 
			Select se=new Select(element);
			se.selectByVisibleText("DC RUN");
			
			Thread.sleep(500);
			
			  driver.navigate().to("https://mwatch.mindtree.com/Portal/index.php?r=infrastructure/asset/view&id=487311");
			  
			  Thread.sleep(500);
			  
			  
			  String s=driver.findElement(By.xpath("//*[@id='Measurements']/table/tbody/tr[6]/td[2]")).getText();
			  
			  String s1=driver.findElement(By.xpath("//*[@id='Measurements']/table/tbody/tr[8]/td[2]")).getText();
			  
			  
			  
			  System.out.println(s+""+s1);
			
			
			  Assert.assertTrue(s.contains("-"));
			  
			  Assert.assertTrue(s1.contains("-"));
	  
		
		
	 
			     }
}
