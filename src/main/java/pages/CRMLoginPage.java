package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMLoginPage {
	
	WebDriver driver;
	
	public void openLoginPage() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterCreds(String email, String pass) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();		
	}

	public String readError() {
		String actualErr = driver.findElement(By.xpath("//div[@class='ui negative message']//p")).getText();
		System.out.println(actualErr);

//		we are not supposed to assert here but in the stepDefinations!!!!!!!!!!!!!
		//Assert.assertEquals("Error does not match!!!!!", "Invalid login",actualErr);
	
		
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
