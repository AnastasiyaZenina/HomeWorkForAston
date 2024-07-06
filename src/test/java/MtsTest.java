import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Проверка сервисов")
public class MtsTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        new WebDriverWait(driver, 10);
        driver.get("http://mts.by");
        WebElement declineCookieButton = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        declineCookieButton.click();
    }

    @AfterEach
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @Story("Проверка оплаты услуг связи")
    @DisplayName("Проверка полей ввода на форме  оплаты услуг связи")
    @Description("Тест проверяет, что поля ввода 'Номер телефона', 'Сумма' и 'E-mail для отправки чека' отображаются корректно.")

    public void checkConnectionServices() {
        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement option = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + "Услуги связи" + "']")));
        option.click();

        By connectionPhone = By.xpath("//*[@id=\"connection-phone\"]");
        String actualConnectionPhone = driver.findElement(connectionPhone).getAttribute("placeholder");
        String expectedConnectionPhone = "Номер телефона";
        assertEquals(actualConnectionPhone, expectedConnectionPhone);

        By connectionSum = By.xpath("//*[@id=\"connection-sum\"]");
        String actualConnectionSum = driver.findElement(connectionSum).getAttribute("placeholder");
        String expectedConnectionSum = "Сумма";
        assertEquals(actualConnectionSum, expectedConnectionSum);

        By connectionEmail = By.xpath("//*[@id=\"connection-email\"]");
        String actualConnectionEmail = driver.findElement(connectionEmail).getAttribute("placeholder");
        String expectedConnectionEmail = "E-mail для отправки чека";
        assertEquals(actualConnectionEmail, expectedConnectionEmail);

    }

    @Test
    @Story("Проверка оплаты домашнего интернета")
    @DisplayName("Проверка полей ввода на форме оплаты домашнего интернета")
    @Description("Тест проверяет, что поля ввода 'Номер абонента', 'Сумма' и 'E-mail для отправки чека' отображаются корректно.")

    public void checkHomeInternet() {
        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement option = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + "Домашний интернет" + "']")));
        option.click();

        By internetPhone = By.xpath("//*[@id=\"internet-phone\"]");
        String actualInternetPhone = driver.findElement(internetPhone).getAttribute("placeholder");
        String expectedInternetPhone = "Номер абонента";
        assertEquals(actualInternetPhone, expectedInternetPhone);

        By internetSum = By.xpath("//*[@id=\"internet-sum\"]");
        String actualInternetSum = driver.findElement(internetSum).getAttribute("placeholder");
        String expectedInternetSum = "Сумма";
        assertEquals(actualInternetSum, expectedInternetSum);

        By internetEmail = By.xpath("//*[@id=\"internet-email\"]");
        String actualInternetEmail = driver.findElement(internetEmail).getAttribute("placeholder");
        String expectedInternetEmail = "E-mail для отправки чека";
        assertEquals(actualInternetEmail, expectedInternetEmail);

    }

    @Test
    @Story("Проверка формы рассрочки")
    @DisplayName("Проверка полей ввода на форме рассрочки")
    @Description("Тест проверяет, что поля ввода 'Номер счета на 44', 'Сумма' и 'E-mail для отправки чека' отображаются корректно.")

    public void checkInstallment() {
        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement option = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + "Рассрочка" + "']")));
        option.click();

        By scoreInstalment = By.xpath("//*[@id=\"score-instalment\"]");
        String actualScoreInstalment = driver.findElement(scoreInstalment).getAttribute("placeholder");
        String expectedScoreInstalment = "Номер счета на 44";
        assertEquals(actualScoreInstalment, expectedScoreInstalment);

        By instalmentSum = By.xpath("//*[@id=\"instalment-sum\"]");
        String actualInstalmentSum = driver.findElement(instalmentSum).getAttribute("placeholder");
        String expectedInstalmentSum = "Сумма";
        assertEquals(actualInstalmentSum, expectedInstalmentSum);

        By instalmentEmail = By.xpath("//*[@id=\"instalment-email\"]");
        String actualInstalmentEmail = driver.findElement(instalmentEmail).getAttribute("placeholder");
        String expectedInstalmentEmail = "E-mail для отправки чека";
        assertEquals(actualInstalmentEmail, expectedInstalmentEmail);

    }

    @Test
    @Story("Проверка формы задолженности")
    @DisplayName("Проверка полей ввода на форме задолженности")
    @Description("Тест проверяет, что поля ввода 'Номер счета на 2073', 'Сумма' и 'E-mail для отправки чека' отображаются корректно.")

    public void checkArrears() {
        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement option = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + "Задолженность" + "']")));
        option.click();

        By scoreArrears = By.xpath("//*[@id=\"score-arrears\"]");
        String actualScoreArrears = driver.findElement(scoreArrears).getAttribute("placeholder");
        String expectedScoreArrears = "Номер счета на 2073";
        assertEquals(actualScoreArrears, expectedScoreArrears);

        By arrearsSum = By.xpath("//*[@id=\"arrears-sum\"]");
        String actualArrearsSum = driver.findElement(arrearsSum).getAttribute("placeholder");
        String expectedArrearsSum = "Сумма";
        assertEquals(actualArrearsSum, expectedArrearsSum);

        By arrearsEmail = By.xpath("//*[@id=\"arrears-email\"]");
        String actualArrearsEmail = driver.findElement(arrearsEmail).getAttribute("placeholder");
        String expectedArrearsEmail = "E-mail для отправки чека";
        assertEquals(actualArrearsEmail, expectedArrearsEmail);
    }

}




