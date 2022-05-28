package Week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("PASSWORD"));
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("DemoSalesManager");
		password.sendKeys("crmsfa");
		submit.click();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Lead ID:')]/following::div/input)[1]")).sendKeys("11245");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='11245']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Edited description");
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		
		
		
		
		
	}

}
