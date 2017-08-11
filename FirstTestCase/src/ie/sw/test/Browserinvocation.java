package ie.sw.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		
		//selenium 3.5
		//gecko driver has a abality to invoke the browser 
		System.setProperty("webdriver.gecko.driver","C:/Users/sarab singh/Desktop/myCourses/SeleniumTesting/seleniumDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
	}

}
