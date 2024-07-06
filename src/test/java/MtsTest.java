
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MtsTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private PaymentPage paymentPage;

    @BeforeTest
    public void setUp() {

        driver = DriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 10);
        homePage = new HomePage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void testBlockTitle() {

        String actualTitle = homePage.getBlockTitle();
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testPaymentSystemLogosPresence() {

        Assert.assertTrue(homePage.isLogosDisplayed());
    }

    @Test
    public void testServiceDetailsLink() {

        homePage.clickOnDetailsLink();
        wait.until(ExpectedConditions.urlContains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }


    @Test
    public void testFieldsAndButtonContinue() {

        paymentPage.fillPaymentForm("297777777", "400", "test.payment2024@mail.ru");
        WebElement bepaidIframe = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-app__container > .bepaid-iframe")));
        driver.switchTo().frame(bepaidIframe);
        WebElement closeButton = driver.findElement(By.cssSelector("body > app-root > div > div > app-header > header > div > app-back-navigation > div > div > svg-icon > svg > line:nth-child(2)"));
        closeButton.click();
        driver.switchTo().defaultContent();
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}