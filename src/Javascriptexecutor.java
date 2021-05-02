import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
		driver.navigate().to("https://www.seleniumhq.org/");
		//drag and click
		
		String jscode1 = "arguments[0].scrollInToView(true)";
		
		String css = "img[src*='applitools.png']";
		
		JavascriptExecutor je=(JavascriptExecutor)driver; //down casting
		je.executeScript(jscode1, driver.findElement(By.cssSelector(css)));
		
		Thread.sleep(3000);
		
		String jscode2="arguments[0].click";
		je.executeScript(jscode2, driver.findElement(By.cssSelector(css)));
	}

}
