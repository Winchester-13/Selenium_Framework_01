package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends Constructor_basepage{
	
	
	public Login(WebDriver driver){
			
		super(driver);
		
	}	
	
	@FindBy(how=How.NAME, using="email")
	WebElement emailaddress;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	
	@FindBy(how=How.XPATH, using="//*[@type=\"submit\"]")
	WebElement loginbtn;
	
	@FindBy(how=How.LINK_TEXT, using="Logout")
	WebElement logoutbtn;
	
	
	
	
	public void enterEmail(String em) {
		
		 emailaddress.sendKeys(em);
		
	}
	
	public void enterPass(String pass) {
		
		password.sendKeys(pass);
	
}
	
	public void loginBtn() {
		
		loginbtn.click();
		
	}
	
	public void logOut() {
		
		logoutbtn.click();
	}
	
}
