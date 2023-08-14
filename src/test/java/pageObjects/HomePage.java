package pageObjects;

import java.time.LocalDate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Finding elements
	Actions act=new Actions(driver);
		@FindBy(xpath = "//span[text()='One way']")
		WebElement tripSelection;
		@FindBy(xpath = "//span[text()='Round trip']")
		WebElement Selection;
		@FindBy(xpath = "//span[text()='1 Adult, Economy']")
		WebElement Adultbtn;
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/div/span/div/div/div[2]/ul/li[3]")
		WebElement Children;
		
		@FindBy(xpath="//input[@placeholder='Where from?']")
		WebElement startpoint1;
		@FindBy(xpath="//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")
		WebElement startpoint2;
		@FindBy(xpath="//input[@placeholder='Where to?']")
		WebElement endpoint1;
		@FindBy(xpath="//p[text()='Hyderabad, IN - Rajiv Gandhi International (HYD)']")
		WebElement endpoint;
		
		
		@FindBy(xpath="//div[@class='flex flex-middle p-relative homeCalender']//div[1]")
		WebElement startDate;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[4]/div/div[1]/div/div/button[2]")
		WebElement returnDate;
		
		@FindBy(xpath="//span[text()='Search flights']")
		WebElement searchFlights;
		
		public void selectRoundTrip() {
			tripSelection.click();
			Selection.click();
			
		}
		
		public void addChild() {
			Adultbtn.click();
			Children.click();
			
		}
		
		public void setOrigin() {
			
			startpoint1.click();
			startpoint2.click();
		 
	        
	    }
		public void setDestination(String destination) {
			endpoint1.sendKeys(destination);
			act.moveToElement(endpoint1).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();

	}
		
		public void startDateSelect(String date) {
			startDate.sendKeys(date);
			
		}
		
		public void returnDateSelect(String enddate) {
			returnDate.sendKeys(enddate);
			
		}
		
		
		   public void searchFlights() {
			   searchFlights.click();
		   }

	

}
