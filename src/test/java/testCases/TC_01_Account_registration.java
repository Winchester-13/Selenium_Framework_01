package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.Homepage;
import pageObjects.Registration;

public class TC_01_Account_registration extends Baseclass {

	
	@Test
	void validation() {
		
		
		Homepage home=new Homepage(driver);
		Registration reg=new Registration(driver);
				
		
		
		//calling 1st page object class methods
		home.myaccountMethod();
		home.registerMethod();
		
		//calling 2nd page object class methods
		
		reg.fnameMethod(randomAlpha());
		reg.lnameMethod(randomAlpha());
		reg.emailMethod(randomAlpha()+"@gmail.com");
		reg.teleMethod(randomNumber());
		
		String password=alphaNumber();
		
		reg.passMethod(password);
		reg.confirmpassMethod(password);

		
		reg.chkMethod();
		reg.submitMethod();
		
		//System.out.println(reg.accCreated());
		
		//SoftAssert soft=new SoftAssert();
		
		//Assert.assertEquals(reg.accCreated(),"Your Account Has Been Created");
		
		//AssertJUnit.assertEquals(reg.accCreated(),"Your Account Has Been Created!");
		//System.out.println("Congo!! Test Validated!!");
		
	//	soft.assertAll();
	}
	
	
	
	
	
	
}

