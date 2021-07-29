
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SearchAction {
	
	WebDriver driver;
	
	@BeforeTest
  	public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\seleniumtests\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--no-sandbox","--disable-gpu");
        driver = new ChromeDriver(options);
  	}

    @Test
    public void testGoogleSearch() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost/");
		String expectedString = "Hello world";
		
        // identify element
        WebElement p=driver.findElement(By.id("myH1"));
		
        //text match
        String heading = p.getText();
		System.out.println("Text content is : " + heading);
		
		if(expectedString.equals(heading))
        System.out.println("The expected heading is same as actual heading --- "+heading);
		else
        System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		
        driver.close();
    }
	
	@AfterTest
  	public void tearDown(){
        	driver.quit();
  	}
}