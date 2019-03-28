
package saPosla;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static saPosla.TestLogIn.driver;

public class AllElemntsOnSite {

    public static WebElement emailOrUsername, password, continueButton;

    public static void main(String args[]) throws IOException {

    }

    public static void findSomeElements() {
        emailOrUsername = driver.findElement(By.xpath("//input[@id='email']"));
        password = driver.findElement(By.xpath("//input[@id='pass']"));
        continueButton = driver.findElement(By.cssSelector("#loginbutton"));
    }
}
