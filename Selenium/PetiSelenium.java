package prviSelenijum;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetiSelenium {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		String url = UrlConfig.NEWTOURS;

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 100);			
			String url3 = UrlConfig.YOUTUBE;
			driver.get(url3);
			WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
			search.sendKeys("Rick Astley");
			Thread.sleep(3000);
			WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
			searchButton.click();
			Thread.sleep(3000);

			WebElement klik = driver.findElement(By.xpath("//a[contains(text(),'Rick Astley - Never Gonna Give You Up (Official Mu')]"));
			
			klik.click();

			Thread.sleep(2000);

			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ytp-play-button ytp-button']"))).click();
			Thread.sleep(2000);
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ytp-play-button ytp-button']"))).click();

			Thread.sleep(6000);

			List<WebElement> list = driver.findElements(By.className("ytd-compact-video-renderer"));
			System.out.println(list);
			
			Thread.sleep(3000);
			list.get(1).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.quit();
		}
	}

}
