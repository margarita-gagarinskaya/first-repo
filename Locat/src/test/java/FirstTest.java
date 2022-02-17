import org.junit.Assert;
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
        String whom0 = "vairys_kat@mail.ru";
        String textOfMassage0= "Завтра к 9:00";
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
        message.sendKeys(textOfMassage0);

        WebElement toWhom = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[contenteditable]")));
        toWhom.click();
        toWhom.sendKeys(whom0);

        WebElement send = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.ComposeControlPanel-Part " +
                        ">div >button[type=button]")));
        send.click();

        WebElement sentMessages = (new WebDriverWait(driver,  Duration.ofSeconds(20)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[data-title=Отправленные]")));
        sentMessages.click();

        WebElement firstOnTheSentList = (new WebDriverWait(driver,  Duration.ofSeconds(20)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-id=t178455135234555923] > div > a")));
        firstOnTheSentList.click();

        WebElement bodyOfMessage = (new WebDriverWait(driver,  Duration.ofSeconds(20)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.MessageBody_body_pmf3j >div")));
        String textOfMessage1 = bodyOfMessage.getText();
        System.out.println(textOfMessage1);
        Assert.assertEquals("Тексты писем не совпадают", textOfMassage0, textOfMessage1);

        WebElement bodyOfLetterRecipient = (new WebDriverWait(driver,  Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*=Cut_expander] >div")));
        String whom1 = bodyOfLetterRecipient.getText();
        System.out.println(whom1);
        Assert.assertEquals("Адреса получателей не совпадают", whom0, whom1);
    }
}
