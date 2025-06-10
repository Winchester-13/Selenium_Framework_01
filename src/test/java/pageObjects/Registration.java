package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registration extends Constructor_basepage {

	
	public Registration(WebDriver driver) {
		
		super(driver);
		
	}
	
	//locators
	
	@FindBy(how=How.NAME, using="firstname")
	WebElement fname;
	
	@FindBy(how=How.NAME, using="lastname")
	WebElement lname;
	
	
	@FindBy(how=How.NAME, using="email")
	WebElement email;
	
	@FindBy(how=How.NAME, using="telephone")
	WebElement telephone;
	
	@FindBy(how=How.NAME, using="password")
	WebElement pass;
	
	@FindBy(how=How.NAME, using="confirm")
	WebElement confirmpass;
	

	@FindBy(how=How.NAME, using="agree")
	WebElement agreechk;
	

	@FindBy(how=How.XPATH, using="//*[@type=\"submit\"]")
	WebElement submitbtn;
	
	
//	@FindBy(how=How.XPATH, using="//h1[contains(text(),'Your Account Has Been Created!')]")
	//WebElement accountcreated;
	
	
	
	//action methods
	
	
	public void fnameMethod(String f) {
		fname.sendKeys(f);
	}
	
	public void lnameMethod(String l) {
		lname.sendKeys(l);
	}
	
	public void emailMethod(String e) {
		email.sendKeys(e);
	}
	
	public void teleMethod(String t) {
		telephone.sendKeys(t);
	}
	
	public void passMethod(String p) {
		pass.sendKeys(p);
	}
	
	public void confirmpassMethod(String c) {
		confirmpass.sendKeys(c);
		
	}
	
	public void chkMethod() {
		
		agreechk.click();
	}
	
	public void submitMethod() {
		
		submitbtn.click();
	}
	
	//public String accCreated() {
	//	return accountcreated.getText();
	//}
	
	
}
