package prviSelenijum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SedmiSelenijum {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		String url = UrlConfig.HOTEL;

		try {
			
			driver.get(url);
			Thread.sleep(3000);

			WebElement searchCity = driver.findElement(By.xpath("//input[@id='citiesInput']"));
			searchCity.sendKeys("Peking");
			WebElement checkIn = driver.findElement(By.xpath("//input[@placeholder='Check in']"));
			checkIn.sendKeys("08/08/2019");
			Thread.sleep(2000);
			WebElement checkOut = driver.findElement(By.xpath("//input[@placeholder='Check out']"));
			checkOut.sendKeys("08/30/2019");
			WebElement click_1 = driver.findElement(By.xpath("//input[@id='totalGuestsInput']"));
			click_1.click();
			Thread.sleep(2000);
			WebElement click_2 = driver.findElement(By.xpath("//button[@id='childPlusBtn']//i[@class='fa fa-plus']"));
			click_2.click();////section[@id='ROOMS']//form[3]//div[1]//div[3]//div[2]//span[1]
			Thread.sleep(2000);
			WebElement click_3 = driver.findElement(By.xpath("//button[@id='childPlusBtn']//i[@class='fa fa-plus']"));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@id='ROOMS']//form[16]//div[1]//div[3]//div[2]//span[1]//div[@id='book203814535']//div[@class='row']//div[2]//form[1]//button[1]"))).click();
			click_3.click();
			Thread.sleep(2000);
			WebElement click_4 = driver.findElement(By.xpath("//div[@class='bgfade col-md-2 go-right col-xs-12 search-button']//button[@type='submit']"));
			click_4.click();
			Thread.sleep(7000);
			WebElement click_5 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/h4[1]/a[1]/b[1]"));
			click_5.click();
			Thread.sleep(3000);
			WebElement click_6 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[6]/section[1]/form[1]/div[1]/div[3]/div[2]/span[1]"));
			click_6.click();
			Thread.sleep(3000);
			WebElement click_7 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[6]/section[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
			click_7.click();
			Thread.sleep(5000);
			WebElement firstName = driver.findElement(By.xpath("//input[@id='card-holder-firstname']"));
			firstName.sendKeys("Pera");
			WebElement lastName = driver.findElement(By.xpath("//input[@id='card-holder-lastname']"));
			lastName.sendKeys("Peric");
			WebElement email = driver.findElement(By.xpath("//input[@id='card-holder-email']"));
			email.sendKeys("pera@peric.com");
			WebElement phone = driver.findElement(By.xpath("//input[@id='card-holder-phone']"));
			phone.sendKeys("9985025847");
			Select country = new Select(driver.findElement((By.xpath("//select[@id='country']"))));
			Thread.sleep(1000);
			country.selectByVisibleText("Uganda");
			WebElement city = driver.findElement(By.xpath("//input[@id='card-holder-city']"));
			city.sendKeys("Perograd");
			Thread.sleep(2000);
			WebElement postalCode = driver.findElement(By.xpath("//input[@id='card-holder-postalcode']"));
			postalCode.sendKeys("11060");
			System.out.println("POSTAL CODE");
			Thread.sleep(2000);
			Select card = new Select(driver.findElement((By.xpath("//select[@id='cardtype']"))));
			System.out.println("CARD TYPE FOUND");
			Thread.sleep(1000);
			card.selectByVisibleText("Master Card");
			System.out.println("CARD TYPE SELECTED");
			Thread.sleep(2000);
			WebElement cardNumber = driver.findElement(By.xpath("//input[@id='card-number']"));
			cardNumber.sendKeys("5324 2038 2979 3700");
			Thread.sleep(2000);
			Select cardExpire = new Select(driver.findElement((By.xpath("//select[@id='expiry-month']"))));
			Thread.sleep(1000);
			cardExpire.selectByVisibleText("Dec (12)");
			WebElement cardCcv = driver.findElement(By.xpath("//input[@id='cvv']"));
			cardCcv.sendKeys("853");
			Thread.sleep(2000);
			WebElement policy = driver.findElement(By.xpath("//input[@id='policy']"));
			policy.click();
			Thread.sleep(2000);
			WebElement clickSubmit = driver.findElement(By.xpath("//button[@name='guest']"));
			clickSubmit.click();
			Thread.sleep(10000);
		
		
		}catch (Exception e) {
			e.toString();
		}finally {
			driver.quit();
		}

	}

}
