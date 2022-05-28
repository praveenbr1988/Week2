package Week2Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookExercise {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait mywait=new WebDriverWait(driver,40);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("lastname");
		
		WebElement ele1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")));
		ele1.sendKeys("1234567896");
		
		WebElement ele2=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		ele2.sendKeys("1234567896");
		
		
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select dayselect = new Select (day);
		dayselect.selectByIndex(5);
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select monthselect = new Select (month);
		monthselect.selectByValue("8");
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select yearselect = new Select (year);
		yearselect.selectByVisibleText("1988");
		
		driver.findElement(By.xpath("//div[text()=\"Gender\"]/following::span[@class=\"_5k_2 _5dba\"][3]")).click();
		
		
		
		
		
		
		
		
		
	}

}
