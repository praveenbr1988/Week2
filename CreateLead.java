package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("PASSWORD"));
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("DemoSalesManager");
		password.sendKeys("crmsfa");
		submit.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC PVT LTD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PraveenTest");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("brtest");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technology");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is test leaf description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praveenbr1988@gmail.com");
		//select state as Newyork
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select city = new Select(ele);
		city.selectByVisibleText("New York");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Hawaii");
		
		WebElement dd = driver.findElement(By.name("dataSourceId"));
		Select select1 = new Select(dd);
		select1.selectByVisibleText("Conference");
		
		driver.findElement(By.name("submitButton")).click();
		String nameverify = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(nameverify);
		if(nameverify.equals("PraveenTest")) {
			System.out.println("Matching");
		}
		else
			System.out.println("Not Matching");
		

		
		
		
	}

}
