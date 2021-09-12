package leaftapsSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition extends Baseclass {

	//public ChromeDriver driver;
	
	/*@Given("Open the Chrome Browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
	}
	
	@Given("Load the Application url {string}")
	public void loadApplication(String urllink) {
		//driver.get("http://leaftaps.com/opentaps/");
		driver.get(urllink);
				
	}*/
	
	/*
	@Given("Enter the username as {string}")
	public void enterUsername(String name) {
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("username")).sendKeys(name);
				
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String pwd) {
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed)
			System.out.println("Home Page is loaded successfully");
		else
			System.out.println("Home Page is not loaded successfully");
	}*/
		
	/*@But("ErrorMessage should be displayed")
	public void displayErrormessage() {
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed();
		if(displayed) {
			System.out.println("Invalid credentials");
			System.out.println(driver.findElement(By.xpath("(//div[@id='errorDiv']/p)[2]")).getText());
		}
	}*/
	
	//Create Lead 
	//public void runCreateLead(String company, String fName, String lName, String ph) {
	/*@Given("Create a Lead")
	public void runCreateLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFN2");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLN2");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988661");
		driver.findElement(By.name("submitButton")).click();
	}	
	
	@Then("Verify Lead created successfully")
	public void searchLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("998866");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		Boolean leadDisplayed = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).isDisplayed();
		if (leadDisplayed)
			System.out.println("Lead created successfully");
		else
			System.out.println("Lead Creation is unsuccessful");
	}*/
}
