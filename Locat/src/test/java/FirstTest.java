import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {

    @Test
    public  void firstTest() {
        String url = "https://mail.yandex.ru/?uid=1561621129#inbox";
        String address = "gagarinskayam@yandex.ru";
        String password = "Jpldmc765!_mdikfco";
        String whom = "barnie3121@gmail.com";
        String textOfMassage= "Отправляется тестовое письмо в автоматическом режиме";
        System.setProperty("webdriver.chrome.driver", "D:/Program Files/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement entry = driver.findElement(By.cssSelector("div.HeadBanner-ButtonsWrapper >a+a"));
        entry.click();

        WebElement inputLogin = driver.findElement(By.cssSelector("input[type*=text]"));
        inputLogin.sendKeys(address);

        WebElement next = driver.findElement(By.cssSelector("div.passp-login-form >form >div[class*=sign-in] >button "));
        next.click();

        WebElement inputPassword = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type*=password]")));
        inputPassword.click();
        inputPassword.sendKeys(password);
        WebElement next1 = driver.findElement(By.cssSelector("button[data-t]"));
        next1.click();

        WebElement pressWrite = (new WebDriverWait(driver,  Duration.ofSeconds(25)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.mail-ComposeButton-Text")));
        pressWrite.click();

        WebElement message = (new WebDriverWait(driver,  Duration.ofSeconds(20)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*=cke_wysiwyg_div] >div")));
        message.click();
        message.sendKeys(textOfMassage);

        WebElement toWhom = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[contenteditable]")));
        toWhom.click();
        toWhom.sendKeys(whom);

        WebElement send = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.ComposeControlPanel-Part " +
                        ">div >button[type=button]")));
        send.click();




    }

}
//div.ns-view-compose-buttons-box." +
//        "ns-view-id-95 > div > div > div > a