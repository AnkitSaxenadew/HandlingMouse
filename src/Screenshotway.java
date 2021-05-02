import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotway {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		//take screenshot of the page
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("/HandlingMouse/screenshot1/fireshot.png");

		try 
		{ Files.copy(srcfile, destfile);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}

}
