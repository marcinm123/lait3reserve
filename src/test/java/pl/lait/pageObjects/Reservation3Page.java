package pl.lait.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.przychodnia3.Init;

public class Reservation3Page {
	
	WebDriver driver;
	
	@FindBy (name = "passFirst0")
	WebElement firstName;
	
	@FindBy (name = "passLast0")
	WebElement lastName;
	
	@FindBy (name = "buyFlights")
	WebElement buy;
	
	public Reservation3Page () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
		}
	
//	public void setFirstName (String name) {
//		Select fName = new Select (firstName);
//		fName.selectByValue("mm");
//		firstName = "mm";
//	}
	
	public void securePurchaseButtonClick() {
		Init.log("Zamawiam bilety");
		buy.click();
	}
		
	
}
