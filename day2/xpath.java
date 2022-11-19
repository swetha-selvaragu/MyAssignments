package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'CRM' )]")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Leads' )]")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Create Lead' )]")).click();
		Thread.sleep(2000);
	    driver.close();
		
		
	}

}
