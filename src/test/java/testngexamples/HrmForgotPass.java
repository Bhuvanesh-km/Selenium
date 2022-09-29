package testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HrmForgotPass {
	WebDriver driver = null;
	@Test
    public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		
    }

    // test case 2
    @Test
    public void testCase2() {
    	driver.findElement(By.xpath("//button")).click(); //presses "cancel"
		String url = driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
