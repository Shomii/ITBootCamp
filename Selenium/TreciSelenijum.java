package prviSelenijum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreciSelenijum {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver web = new FirefoxDriver();
		String url = UrlConfig.FACEBOOK;

		web.get(url);	

		
		String actualUrl = web.getCurrentUrl();
		
		if(actualUrl.equals(url)) {
			System.out.println("Na dobrom ste sajtu ->" + actualUrl);
		}else {
			System.out.println("Greska, trenutno ste na sajtu " + actualUrl);
		}

		try {

			WebDriverWait wait = new WebDriverWait(web, 100);
			
			WebElement username = web.findElement(By.id("email"));
			username.sendKeys("pera@peric.com");			 
			web.findElement(By.id("pass")).sendKeys("perica");
			
			Thread.sleep(2000);

			web.findElement(By.xpath("//input[@id='u_0_2']")).click();		
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='_5iyx']")));
			web.get(url);	
			WebElement element;
			element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']")));
			
			System.out.println("krenuo");
			
			Actions actions = new Actions(web);			
			element.click();
			String newActualUrl = web.getCurrentUrl();
			System.out.println(newActualUrl);
			web.navigate().back();
		}catch (Exception e) {
			System.out.println("greska "+e.toString());
		}
		web.quit();

	}
	
}
