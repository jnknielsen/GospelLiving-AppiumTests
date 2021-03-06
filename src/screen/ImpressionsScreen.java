package screen;

import com.gargoylesoftware.htmlunit.javascript.host.Touch;
import io.appium.java_client.*;
import org.openqa.selenium.*;
import java.util.List;
import java.util.NoSuchElementException;

public class ImpressionsScreen extends AbstractScreen {

	public ImpressionsScreen(AppiumDriver driver) {super(driver);}

	//Elements
	private WebElement AllTab = driver.findElementByAccessibilityId("All");
	private WebElement ActiveTab = driver.findElementByAccessibilityId("Active");
	private WebElement CompleteTab = driver.findElementByAccessibilityId("Complete");
	private WebElement btnCreateImpression = driver.findElementByAccessibilityId("createImpression");


	//Methods
	public void SelectAllTab(){
		AllTab.click();
	}

	public boolean AllTabIsDisplayed(){
		return AllTab.isDisplayed();
	}

	public void SelectActiveTab(){
		ActiveTab.click();
	}

	public boolean ActiveTabIsDisplayed(){
		return ActiveTab.isDisplayed();
	}

	public void SelectCompleteTab(){
		CompleteTab.click();
	}

	public boolean CompleteTabIsDisplayed(){
		return CompleteTab.isDisplayed();
	}

	public boolean GivenImpressionExists(String impression){
		try{
			return driver.findElementByAccessibilityId(impression).isDisplayed();
		}
		catch (Exception e){
			return false;
		}
	}

	public void TapGivenImpression(String impression){
		driver.findElementByAccessibilityId(impression).click();
	}

	public void TapCompleteOnGivenImpression(String impression){
		driver.findElementByAccessibilityId(impression)
				.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Complete\"])[2]"))
				.click();
	}

	public void TapCreateImpression(){
		btnCreateImpression.click();
	}


}
