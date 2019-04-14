import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class reservation {

	  public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		    // get application from URL
		    
		    driver.get("https://restaurantsclient.herokuapp.com/#/");
		 
		    //maximize window	
		    
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
			Thread.sleep(4000);
			
			//enter log in credentials 
			
			driver.findElement(By.xpath("//a[@class='ng-scope']")).click();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testic");
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div[5]/input")).click();
			
			// enter reservation parameters
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[1]/input")).sendKeys("Sarajevo");
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[2]/input")).sendKeys("2");
			
			// enter date 
			
		    WebElement datepicker = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/md-datepicker/button"));
		    datepicker.click();
		    datepicker.sendKeys(Keys.ENTER);
			
		    // enter time 
		    
		    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/div/table/tbody/tr[2]/td[1]/input")).sendKeys("20");
		    
		    Thread.sleep (2000);
		    
		    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[5]/input")).click();
		    
		    Thread.sleep (2000);
		  
	        // select reservation
		    
		    driver.findElement(By.xpath("//*[@id=\"0\"]/input")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[4]/input")).click();
			
		    Thread.sleep (3000);
		  
		    driver.findElement(By.xpath("//*[@id=\"0\"]/input")).click();
		  
		    Thread.sleep (3000);
		  
		    driver.findElement(By.xpath("/html/body/div[2]/div/form/input")).click();
		  
		    Thread.sleep (3000);
		  
		    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a")).click();
		
		
		    Thread.sleep(3000);
			
	        driver.close();
	        
        }
	  
}
