package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		    
		    String titleLead=driver.getTitle();
		    System.out.println(titleLead);
		    
		    driver.findElement(By.linkText("Duplicate Lead")).click();
		    
		    WebElement eleDuplicateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		    eleDuplicateCompanyName.clear();
		    eleDuplicateCompanyName.sendKeys("Amazon");
		    WebElement eleDuplicateFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		    eleDuplicateFirstName.clear();
		    eleDuplicateFirstName.sendKeys("Stuart");
		    WebElement eleDuplicateSubmit = driver.findElement(By.name("submitButton"));
		    eleDuplicateSubmit.click();
		    
		    String titleDuplicateLead=driver.getTitle();
		    System.out.println(titleDuplicateLead);
	

		    Thread.sleep(2000);
		    driver.close();
		    

	}

}
