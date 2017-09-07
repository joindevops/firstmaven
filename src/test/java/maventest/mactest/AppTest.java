package maventest.mactest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest {


	@Test 
	
public static void Run(){
	
  System.setProperty("webdriver.chrome.driver", "/Users/saurabhdubey/Desktop/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
   }


}
