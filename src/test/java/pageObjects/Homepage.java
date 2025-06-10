package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Homepage extends Constructor_basepage{
	
	public Homepage(WebDriver driver){
		
		super(driver);
	}
	
	
	//locators
	
	@FindBy(how=How.XPATH, using="//*[@title=\"My Account\"]")
	WebElement myaccount;
	
	@FindBy(how=How.LINK_TEXT, using="Register")
	WebElement register;
	
	@FindBy(how=How.LINK_TEXT, using="Login")
	WebElement login;
	

	
	
	//action methods
	
	public void myaccountMethod() {
		
		myaccount.click();
		
	}
	
	public void registerMethod() {
		
		register.click();
		
	}
	
	
	public void login() {
	
		login.click();
	}
	
}
