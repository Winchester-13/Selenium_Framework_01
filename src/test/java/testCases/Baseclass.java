package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class Baseclass {
	
	
	public Properties p= new Properties();
	WebDriver driver;
	//common methods
	
	
	
	@BeforeClass
	@Parameters("browser")
	void browserSetup(String brow) throws IOException {
			
		
		FileReader file=new FileReader("./src/test/resources/configuration.properties");
		p.load(file);
		
		switch(brow.toLowerCase()) {
		
		case "chrome":
		
			driver= new ChromeDriver();
			break;
			
		case "edge":
		
			driver=new EdgeDriver();
			break;
		
		default:
			
			System.out.println("Invalid browser");

			return;
		
		}
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("url"));
	
  
		 
				
	}
	
	/*@AfterClass
	void quit()
	{
		
		driver.quit();
	}
	
	*/
	
	String randomAlpha() {
		
		String alpha=RandomStringUtils.randomAlphabetic(7);
		return alpha;
		
		
	}
	
	String randomNumber() {
		
		String number=RandomStringUtils.randomNumeric(10);
		
		return number;
	}
	
	String alphaNumber() {
		
		String alphanum=RandomStringUtils.randomAlphanumeric(10);
		return alphanum;
	}
	
	
}
