package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_002_SearchPageTest extends BaseClass {

	public TC_002_SearchPageTest(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test_Search()
	{
		logger.info("Starting...");
		
		try
		{				
			SearchPage sp=new SearchPage(driver);
			sp.clickNonStop();
			sp.clickTime();
			sp.clickBook();
			sp.clickFare();
			sp.clickContinue();
			sp.clickSkip();
			sp.setTelephone(randomNumber());
			sp.setEmail(randomString()+"@gmail.com");
			sp.clickCnt2();
			
		    
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Finished TC_002_SearchPageTest");
		
	}
	
	
}

	
	

