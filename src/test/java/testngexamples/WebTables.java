package testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {
	WebDriver driver = null;
	@Test
    public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("//C:/Users/EI13120/Desktop/webTable.html");	
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
		
    }

    // test case 2
    @Test
    public void testCase2() {
    	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]")).getText());
    }
}
