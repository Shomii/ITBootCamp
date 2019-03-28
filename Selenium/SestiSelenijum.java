package prviSelenijum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SestiSelenijum {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String url = UrlConfig.NEWTOURS;

		try {
			
			driver.get(url);
			Thread.sleep(3000);
			WebElement register = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
			register.click();
			Thread.sleep(2000);
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
			firstName.sendKeys("Pera");
			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
			lastName.sendKeys("Peric");
			WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
			phone.sendKeys("32558485");
			WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));
			email.sendKeys("pera@pera.com");
			WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
			address.sendKeys("Perina ulica 5");
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			city.sendKeys("Perograd");
			WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
			state.sendKeys("Alabama");
			WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
			postalCode.sendKeys("11050");
			Select country = new Select(driver.findElement((By.xpath("//select[@name='country']"))));
			Thread.sleep(1000);
			country.selectByVisibleText("UGANDA");
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("pera");
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("perica123");
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			confirmPassword.sendKeys("perica123");
			WebElement submit = driver.findElement(By.xpath("//input[@name='register']"));
			submit.click();
			Thread.sleep(3000);
			
			String goodUrl = "newtours.demoaut.com/create_account_success.php";
			
			if(driver.getCurrentUrl().equals(goodUrl)) {
				System.out.println("dobra adresa");
			}else {
				System.out.println("adresa nije dobra");
			}
			
			WebElement signOff = driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));
			signOff.click();
			Thread.sleep(3000);
			WebElement username2 = driver.findElement(By.xpath("//input[@name='userName']"));
			username2.sendKeys("pera");
			Thread.sleep(2000);
			WebElement password2 = driver.findElement(By.xpath("//input[@name='password']"));
			password2.sendKeys("perica123");
			WebElement submit2 = driver.findElement(By.xpath("//input[@value='Login']"));
			submit2.click();
			Thread.sleep(3000);
			
			
		}catch (Exception e) {
			e.toString();
		}finally {
			driver.quit();
		}

	}

}
