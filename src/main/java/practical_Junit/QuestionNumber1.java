package practical_Junit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionNumber1 {
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", ".\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");
	}

	@Test
	public void toggleAllCheckOn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='controls']/child::*[3]")).click();
	}

	public void removeSingleItemUsingRemoveButton() throws InterruptedException {
		WebElement SELECTFROMCHECKBOX = driver.findElement(By.xpath(
				"//div[@id='todos-content']/child::*[@action='todo.php']/child::*[@style]/child::*[1]/child::*[@name]"));
		SELECTFROMCHECKBOX.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Remove']")).click();
	}

	public void removeAllWhenToggleOn() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='controls']/child::*[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Remove']")).click();
	}

}
