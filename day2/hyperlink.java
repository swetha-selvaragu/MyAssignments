package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dashboard = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
		dashboard.click();
		driver.navigate().back();
		
		String url = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("href");
		url = driver.getCurrentUrl();
		System.out.println("The destination URL is : " + url);
					
		String url1 = "https://leafground.com/link.xhtml";
		driver.get(url1);
		java.util.List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + link.size());
	      
	    
		
	      driver.close();

	}

}
