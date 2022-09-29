package testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver = null;
	@Test
    public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("bhuvanesh");
		driver.findElement(By.name("lastname")).sendKeys("KM");
		driver.findElement(By.name("reg_email__")).sendKeys("bhuvanesh1@gmalil.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bhuvanesh1@gmalil.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bhuvi@12345");
		
    }

    // test case 2
    @Test
    public void testCase2() {
    	driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.name("websubmit")).click();
    }
}
