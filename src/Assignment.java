import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.istqb.in/");

		driver.manage().window().maximize();

		WebElement abtus = driver.findElement(By.xpath("//div[@id='tmMainMenu']//a[text()='ABOUT US']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(abtus).perform();
		act.pause(2000).perform();
		
		String afcmpy = "//div[@id='tmMainMenu']//a[text()='ABOUT US']/following-sibling::div/descendant::a[text()=\"AFFILIATED COMPANIES\"]";
		WebElement ckl = driver.findElement(By.xpath(afcmpy));
		
		ckl.click();
		
		driver.findElement(By.xpath("//div[@id='tmTopD']//a[text()='A']")).click();
		
		
		List<WebElement> timg = driver.findElements(By.xpath("//div[@id='tmMainBody']//article//div//a"));
		System.out.println("total image :"+timg.size());
		
		for (int i = 1; i <=timg.size(); i++) 
		{
			String dataxp = "//div[@id='tmMainBody']//article//div["+i+"]//a";
			String output = driver.findElement(By.xpath(dataxp)).getText();
			System.out.println(output);
		}
		
		
		
	}
}
		
		
		