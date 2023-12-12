package frameworkpackage.abstractcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	WebDriver driver;
	
	//create constructor
	public AbstractComponent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementToAppear(By findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	
	public void waitForWebElementToAppear(WebElement findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(findby));
	}
	
	public void waitForElementToDisappear(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}