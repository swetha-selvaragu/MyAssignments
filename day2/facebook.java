package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
		driver.findElement(By.xpath("//a[contains (@data-testid, 'open-registration')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swetha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selvaragu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358511123");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ironman@123");
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd1 = new Select(elementDay);
		dd1.selectByValue("18");
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select dd2 = new Select(elementMonth);
		dd2.selectByValue("8");
		WebElement elementYear = driver.findElement(By.id("year"));
		Select dd3 = new Select(elementYear);
		dd3.selectByValue("1998");
		driver.findElement(By.linkText("Female")).click();
	}

}
