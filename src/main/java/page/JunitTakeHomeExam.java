package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JunitTakeHomeExam {

	WebDriver driver;

	public JunitTakeHomeExam(WebDriver driver) {
		this.driver = driver;
	}

	WebElement TOGGLECHECKBOX = driver.findElement(By.xpath("//div[@class='controls']/child::*[3]"));
	WebElement SELECTFROMCHECKBOX = driver.findElement(By.xpath(
			"//div[@id='todos-content']/child::*[@action='todo.php']/child::*[@style]/child::*[1]/child::*[@name]"));
	WebElement REMOVESELECTEDBOX = driver.findElement(By.xpath("//input[@value='Remove']"));

	public void toggleAllCheckOn() {
		TOGGLECHECKBOX.click();
	}

	public void removeSingleItemUsingRemoveButton() {
		SELECTFROMCHECKBOX.click();

		REMOVESELECTEDBOX.click();
	}

	public void removeAllWhenToggleOn() {
		TOGGLECHECKBOX.click();

		REMOVESELECTEDBOX.click();
	}

}
