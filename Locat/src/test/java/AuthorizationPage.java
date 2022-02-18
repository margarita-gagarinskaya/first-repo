import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage {

    //конструктор класса, занимающийся инициализацией полей класса
    public static WebDriver driver;
    public AuthorizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //определение локатора кнопки ВХОД
    @FindBy(css = "div.HeadBanner-ButtonsWrapper >a+a")
    private static WebElement entry;

    //определение локатора поля ввода логина
    @FindBy(css = "input[type*=text]")
    private static WebElement inputLog;

    //определение локатора кнопки ДАЛЕЕ
    @FindBy(css = "div.passp-login-form >form >div[class*=sign-in] >button ")
    private static WebElement next;

    //определение локатора поля ввода пароля
    @FindBy(css = "input[type*=password]")
    private static WebElement inputPasswd;

    //определение локатора кнопки ДАЛЕЕ
    @FindBy(css = "button[data-t]")
    private static WebElement next1;

    //метод для нажатия кнопки ВХОД
    public static void entryBtn(){
    entry.click();}

    //метод для ввода логина
    public static void inputLogin(String login) {
        inputLog.sendKeys(login); }

    //метод для нажатия кнопки ДАЛЕЕ
    public static void nextBtn(){
    next.click();}

    //метод для ввода пароля
    public static void inputPassword(String passwd) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type*=password]")));
        inputPasswd.click();
        inputPasswd.sendKeys(passwd); }

    //метод для нажатия кнопки ДАЛЕЕ
    public static void nextBtn1(){
        next1.click();}
    }
