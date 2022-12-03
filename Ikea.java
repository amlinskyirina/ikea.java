import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLElement;

public class Ikea {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.ikea.com/il/he/");
		
		Thread.sleep(1000);	
		// registration
		driver.findElement(By.xpath("//*[@id=\"hnf-header-profile\"]/a/span")).click(); //Entering to Login
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"profile-frontend\"]/div/div/div[1]/button/span/span/span")).click(); // Entering to registration
		
		
		
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-firstName\"]")).sendKeys("irina"); // First name
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-lastName\"]")).sendKeys("amlinsky"); // Last name
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-password\"]")).sendKeys("Ira123456"); // Password
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-username\"]")).sendKeys("amlinsky16@gmail.com"); // Email
		
		
		Thread.sleep(500);
		
		
		js.executeScript("window.scrollBy(0, 500)", "");
		
 
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-allowEmail-error\"]")).click(); //checkbox email

		
		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-acceptPrivacyPolicy\"]")).click();//checkbox -acceptPrivacyPolicy
				
	

		driver.findElement(By.xpath("//*[@id=\"regular-signup-form-submit\"]/span")).click();//signup profile
//		
		//driver.get("https://www.ikea.com/il/he/profile/login/");
		Thread.sleep(1000);
		 
		
		 
		
		//	Fill ‘tables’ in the search area and search for it
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("שולחן"); //write table
	
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ol[@id='search-suggestions']/li/a[contains(@href, 'שולחן קפה')]")).click(); //table of caffee
		driver.findElement(By.xpath("//*[@id=\"search-box__searchbutton\"]")).click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 2600)", ""); //scroll down
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#load-more-24-products']/span")).click();//show more      
		js.executeScript("window.scrollBy(0, 2500)", ""); //scroll down
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(1000, 0)", ""); //scroll up
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.ikea.com/il/he/p/trulstorp-coffee-table-black-brown-00400277/']")).click();// Click Trulstorp
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pip-buy-module-content\"]/div[2]/div/button/span/span[1]")).click();//Choose color
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='pip-link-list']/a[@href='https://www.ikea.com/il/he/p/trulstorp-coffee-table-white-20400276/#content']")).click();//Choose White
											    
		driver.findElement(By.xpath("//button[@class=\"pip-link-button pip-availability-modal-open-button\"]")).click(); //Click for see locations
		js.executeScript("window.scrollBy(0, 1000)", ""); //scroll down
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"change-store-input\"]")).sendKeys("נתניה");// If avaliable in Natania	
		
		Thread.sleep(2000);	
		driver.quit();
	}

}
