package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageObjects.Constructor_basepage;
import pageObjects.Homepage;
import pageObjects.Login;

public class TC_02_Login extends Baseclass{
		
	@Test
	void ValidationLogin() throws IOException {
		
		
		Homepage home= new Homepage(driver);
		
		
		home.myaccountMethod(); 
		home.login();
		
		Login log=new Login(driver);
		
		log.enterEmail(p.getProperty("username"));
		log.enterPass(p.getProperty("password"));
		log.loginBtn();
		
		
		
	}

}
