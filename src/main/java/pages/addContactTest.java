package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import com.crm.qa.pages.NewContactPage;

public class addContactTest {
	
	WebDriver driver;
	
	public void openLoginPage2() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	public String getTitle2() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	public void enterCreds2(String email, String pass) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	public void clickLoginBtn2() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();		
	}

	public String readError2() {
		String actualErr = driver.findElement(By.xpath("//div[@class='ui negative message']//p")).getText();
		System.out.println(actualErr);

//		we are not supposed to assert here but in the stepDefinations!!!!!!!!!!!!!
		//Assert.assertEquals("Error does not match!!!!!", "Invalid login",actualErr);
	
		
		return actualErr;
	}
	
	
	public boolean verifyUserName() throws InterruptedException {
	Thread.sleep(2000);
		WebElement Uname = driver.findElement(By.xpath("//span[@class='user-display'][contains(text(),'Nikunj Patel')]"));
		return Uname.isDisplayed();
	}
	
	public void clickOnNewContactLink() throws InterruptedException {
		WebElement contactsLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		WebElement newContactLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]//parent::a//following-sibling::button"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(contactsLink).build().perform();
		//Thread.sleep(2000);
		newContactLink.click();
		//return new NewContactPage();
	Thread.sleep(2000);
	driver.navigate().refresh();
		
	}
	
	public void newContactPage() throws InterruptedException {
		WebElement flagBtn = driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']"));
		//WebElement contactsLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(contactsLink).build().perform();
		 new Actions(driver)
         .moveByOffset(130, 150)
         .perform();
		 do {
				driver.navigate().refresh();
			}while (flagBtn.isDisplayed() == false);
	}
	
	public boolean verifyFlagBtn() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement flagBtn = driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']"));
		//WebElement contactsLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(contactsLink).build().perform();
//		 new Actions(driver)
//         .moveByOffset(130, 150)
//         .perform();
//		 do {
//				driver.navigate().refresh();
//			}while (flagBtn.isDisplayed() == false);
		return flagBtn.isDisplayed();
	}
	
	public void createContact(String fname, String lname) throws InterruptedException {
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
	}
	
	public void clickSaveContact() throws InterruptedException {
		Thread.sleep(1000);
		WebElement saveBtn = driver.findElement(By.xpath("//button[@class='ui linkedin button']/i"));
		
		saveBtn.click();
	}
	
	public void closeBrowser2() {
		driver.quit();
	}
	

}
