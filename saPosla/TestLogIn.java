package saPosla;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestLogIn {

    public static WebDriver driver = new FirefoxDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, 50);

    public static void main(String args[]) throws IOException {

        try {

            driver.get(UrlConfig.FACEBOOK);
            driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

            FromExcel excel = new FromExcel();
            excel.getUserAndPass();
            Thread.sleep(3000);

            for (int i = 0; i < FromExcel.userName.size(); i++) {

                AllElemntsOnSite.findSomeElements();
                String u = FromExcel.userName.get(i);
                AllElemntsOnSite.emailOrUsername.click();
                AllElemntsOnSite.emailOrUsername.sendKeys(u);
                Thread.sleep(2000);

                String p = FromExcel.password.get(i);
                AllElemntsOnSite.password.click();
                AllElemntsOnSite.password.sendKeys(p);
                Thread.sleep(2000);

                AllElemntsOnSite.continueButton.click();
               // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loginbutton")));
                Thread.sleep(2000);
                driver.navigate().back();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.toString();
        } finally {
            driver.quit();
        }

    }
}
