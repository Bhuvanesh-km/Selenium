package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestExample {
	
	WebDriver driver = null;
	
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		String actualResult;
		String expectedResult="PIM";
		actualResult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualResult,expectedResult);
	}
	
	@Then("user is logged out")
	public void user_logged_out() {
		WebElement web=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		
		Select select = new Select(web);
		select.selectByVisibleText("Logout");
		
		
	}


}
