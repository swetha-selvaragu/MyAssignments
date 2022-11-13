package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		 WebElement eleUserName = driver.findElement(By.id("username"));
		    eleUserName.sendKeys("Demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Create Lead")).click();
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvaragu");
		    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swe");
		    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		    driver.findElement(By.id("createLeadForm_description")).sendKeys("Description is given");
		    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Swethas180898@gmail.com");
		    WebElement elestate = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		    Select dd = new Select(elestate);
		    dd.selectByVisibleText("New York");
		    driver.findElement(By.className("smallSubmit")).click();
		    
		    String titleViewLead=driver.getTitle();
		    System.out.println(titleViewLead);
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.linkText("Edit")).click();
		    driver.findElement(By.name("description")).clear();
		    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updating the lead");
		    driver.findElement(By.name("submitButton")).click();
		    
		    String titleEditLead = driver.getTitle();
		    System.out.println(titleEditLead);
		    
		    Thread.sleep(2000);
		    driver.close();



		    
		    

	}

}
