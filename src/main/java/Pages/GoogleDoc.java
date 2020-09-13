package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class GoogleDoc extends TestBase {
	private String dogRadioButtonXpath = "(//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle'])[1]";	
	private String dogDropdownXpath = "(//span[@class='quantumWizMenuPaperselectContent exportContent'])[1]";	
	private String dogValueXpath="(//span[@class='quantumWizMenuPaperselectContent exportContent'])[6]";
	private String textFieldXpath="(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[1]";
	private String dateFieldXpath="(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[2]";
	private String submitXpath ="//span[@class='appsMaterialWizButtonPaperbuttonLabel quantumWizButtonPaperbuttonLabel exportLabel']";
	
	
	public GoogleDoc(){	
	}
	public void selectDogRadiobutton() {
		WebElement  dogRadioButton = driver.findElement(By.xpath(dogRadioButtonXpath));
	    dogRadioButton.click(); 
		System.out.println("Radio button is selected");
}
	public void selectDogDropdown() throws InterruptedException {
		WebElement  selectDropdown = driver.findElement(By.xpath(dogDropdownXpath));
		selectDropdown.click();
		WebElement dogValueDropdown=driver.findElement(By.xpath(dogValueXpath));
		TestBase.clickOn(driver,dogValueDropdown,20);
		Thread.sleep(2000);
		System.out.println("Dog is selected from dropdown");
	}
	
	
 public void enterDog() {
	 WebElement inputText=driver.findElement(By.xpath(textFieldXpath));	
	 inputText.sendKeys("Dog");
	 System.out.println("Dog is entered in the text field");
	 
	}
 
 public void enterDate() {
	 WebElement inputText=driver.findElement(By.xpath(dateFieldXpath));
	inputText.click();
	 inputText.sendKeys("2019");
	 inputText.sendKeys(Keys.TAB);
	 inputText.sendKeys("10");
	 inputText.sendKeys("01");
	 System.out.println("Date is entered in the field");
	 
	 
	}
public void submitForm() {
	WebElement submit = driver.findElement(By.xpath(submitXpath));
	submit.click();
	 System.out.println("Form is submitted");
}
	}
