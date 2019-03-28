package prviSelenijum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrugiSelenijum {

public static void main(String[] args) throws InterruptedException {

		
		WebDriver web = new FirefoxDriver();
		String url = UrlConfig.EVE;
		web.get(url);
		System.out.println();
		String title = web.getTitle();
		System.out.println(title);
		int duzina = title.length();
		System.out.println("duzina title: "+duzina);
		String sors = web.getPageSource();
		int duzinaSorsa = sors.length();
		System.out.println("duzina soursa: " +duzinaSorsa);
		
		String actualUrl = web.getCurrentUrl();
		
		if(actualUrl.equals(url)) {
			System.out.println("Dobar sajt");
		}else {
			System.out.println("Greska, trenutno ste na sajtu " + actualUrl);
		}
		
		if(duzinaSorsa<5000) {
			System.out.println("duzina je manja od 5000");
		}else {
			System.out.println("duzina je veca od 5000");
		}

		try {

			WebDriverWait wait = new WebDriverWait(web, 100);
			WebElement element;
			web.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			element= wait.until(ExpectedConditions.elementToBeClickable(By.className("Explore__icon___1PvKb")));
			
			System.out.println("krenuo");
			Actions actions = new Actions(web);

			((JavascriptExecutor) web).executeScript("arguments[0].scrollIntoView();", element);
			actions.moveToElement(element).click().perform();
	
			String newActualUrl = web.getCurrentUrl();
			System.out.println(newActualUrl);
			
		}catch (Exception e) {
			System.out.println("greska "+e.toString());
		}
		web.quit();

	}
	
}
