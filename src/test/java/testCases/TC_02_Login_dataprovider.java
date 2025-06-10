package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Constructor_basepage;
import pageObjects.Homepage;
import pageObjects.Login;

public class TC_02_Login_dataprovider extends Baseclass{
	
	@DataProvider(name="login")
	public Object[][] provideData(){
		
		Object cred[][]={
				
				{(p.getProperty("user_01")),(p.getProperty("pass_01"))  },
				{(p.getProperty("user_02")),(p.getProperty("pass_02"))  }
				
				
				
		};
		
		return cred;
		
	}
		
	@Test(dataProvider="login")
	void ValidationLogin(String username, String pwd) throws IOException {
		
		
		
		Homepage home= new Homepage(driver);
		
		
		home.myaccountMethod(); 
		home.login();
		
		Login log=new Login(driver);
		
		
		
		log.enterEmail(username);
		log.enterPass(pwd);
		log.loginBtn();
		log.logOut();
		
		
		
		
	}

}
