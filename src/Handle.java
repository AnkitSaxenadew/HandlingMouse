import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		//cancel the login
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//to do mouse over on home and furniture
		
		WebElement hf = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act=new Actions(driver) ;
		//to mouse over
		
		act.moveToElement(hf).perform();
		act.pause(2000).perform();
		
		//mouse click on paintings
		WebElement paintingswb=driver.findElement(By.linkText("Paintings"));
		
		act.click(paintingswb).perform();
		act.pause(2000).perform();
		//range slider
		
		WebElement rightslider = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']"));
		//slider the bar
		act.clickAndHold(rightslider).perform();
		act.moveByOffset(-90, 0).perform();
		act.release(rightslider).perform();
		act.pause(2000).perform();
		
		
		//click check box x path
		
		String xp=("//img[contains(@src,'flixcart.com')]/ancestor::div/preceding-sibling::input");
				
		WebElement chkbx = driver.findElement(By.xpath("xp"));
		//click check box
		act.click(chkbx).perform();
		act.pause(2000).perform();
		//search in the bar
		
		WebElement searchtxtbx = driver.findElement(By.name("q"));
		//by send keys
		act.sendKeys(searchtxtbx,"Samsung phones").perform();
		act.pause(2000).perform();
		//want to click on second option
		act.sendKeys(searchtxtbx,Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.pause(2000).perform();
		act.sendKeys(Keys.ENTER).perform();
		act.pause(2000).perform();
		
				
		

	}

}
