package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Week2Day1 {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get(" http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement inputUsername = driver.findElement(By.id("username"));
		inputUsername.sendKeys("Demosalesmanager");
		WebElement inputPassword = driver.findElement(By.id("password"));
		inputPassword.sendKeys("crmsfa");
		WebElement clickOnLoginButton = driver.findElement(By.className("decorativeSubmit"));
		clickOnLoginButton.click();
		WebElement clickHyperLink = driver.findElement(By.linkText("CRM/SFA"));
		clickHyperLink.click();
		WebElement clickLead = driver.findElement(By.linkText("Leads"));
		clickLead.click();
		WebElement clickCreateLead = driver.findElement(By.linkText("Create Lead"));
		clickCreateLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Amazon");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Hari");
		WebElement surName = driver.findElement(By.id("createLeadForm_lastName"));
		surName.sendKeys("P");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("hari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("This is the description of the field");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harishankergr8@gmail.com");
		WebElement webElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(webElement);
		dropDown.selectByVisibleText("New York");	
		WebElement createLead = driver.findElement(By.className("smallSubmit"));
		createLead.click();
		
		
		//editing
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is a important note");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The title is :"+driver.getTitle());
		
		

	}

}
