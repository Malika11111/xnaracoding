package testCases;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;


import testBase.BaseClass;

public class TC_001_HomePageTest extends BaseClass {
	
	@Test
	public void test_Login()
	{
		logger.info("Starting");
		
		try
		{				
			HomePage hp=new HomePage(driver);
			
			hp.selectRoundTrip();
			hp.addChild();
			hp.setOrigin();
			hp.setDestination(rb.getString("destination"));
			hp.startDateSelect(rb.getString("date"));
			hp.searchFlights();
			
			
		    //hp.returnDateSelect(LocalDate.now().plusDays(15));
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Finished TC_001_LoginTest");
		
	}
	
	
}

	
	


