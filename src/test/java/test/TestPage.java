package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.JunitTakeHomeExam;
import util.BrowserFactory;

public class TestPage {

	WebDriver driver;
	
	@Test
	public void testingMethods()    {
		
		driver = BrowserFactory.init();
		
		JunitTakeHomeExam junitexam = PageFactory.initElements(driver, JunitTakeHomeExam.class);
		junitexam.toggleAllCheckOn();
		junitexam.removeSingleItemUsingRemoveButton();
		junitexam.removeAllWhenToggleOn();
	}
}
