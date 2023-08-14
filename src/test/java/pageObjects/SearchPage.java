package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
	
	@FindBy(xpath="//p[text()='Non-stop']")
	WebElement chkbox1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div[1]/div/aside/div[2]/div[4]/div[2]/div/label[5]/div[2]/div/p")
	WebElement chkbox2;

	
	@FindBy(xpath="//span[text()='Book now']")
	WebElement bookclk;
	
	@FindBy(xpath="//div[@class='flex flex-1 px-0 '][1]")
	WebElement standardfare;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement contbtn;
	
	@FindBy(xpath="//button[text()='Skip this step']")
	WebElement skipbtn;
	
	@FindBy(xpath="//input[@data-testid='mobileNumber']")
	WebElement phNum;
	
	@FindBy(xpath="//input[@data-testid='email']")
	WebElement emailField;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[1]/main/div[8]/div/div/div[6]/button")
	WebElement cnt2;

   public void clickNonStop() {
	   chkbox1.click();
   }
   
   public void clickTime() {
	   chkbox2.click();
   }
   public void clickBook() {
	   bookclk.click();
   }
   
   public void clickFare() {
	   standardfare.click();
   }
   public void clickContinue() {
	   contbtn.click();
   }
   
   public void clickSkip() {
	   skipbtn.click();
   }
   
   public void setTelephone(String tel) {
	   phNum.sendKeys(tel);

	}
   public void setEmail(String email) {
	   emailField.sendKeys(email);

	}
   public void clickCnt2() {
	   cnt2.click();
   }
   
}