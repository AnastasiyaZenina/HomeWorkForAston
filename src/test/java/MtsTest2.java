
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MtsTest2 {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://mts.by");
        WebElement declineCookieButton = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        declineCookieButton.click();
        WebElement dropdownList = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"));
        dropdownList.click();
        WebElement option = new WebDriverWait(driver, (10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + "Услуги связи" + "']")));
        option.click();

        driver.findElement(By.cssSelector("#connection-phone")).sendKeys("297777777");
        WebElement sumInput = driver.findElement(By.cssSelector("#connection-sum"));
        sumInput.sendKeys("400");
        WebElement emailInput = driver.findElement(By.cssSelector("#connection-email"));
        emailInput.sendKeys("test.payment2024@mail.ru");
        WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection > button"));
        continueButton.click();
        WebElement bepaidIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-app__container > .bepaid-iframe")));
        driver.switchTo().frame(bepaidIframe);
        WebDriverWait wait = new WebDriverWait(driver, 15);
    }

    @AfterEach
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void testAmount() {

        WebElement amountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > div > div")));
        String amountText = amountElement.getText();
        assert "400.00 BYN".equals(amountText.trim());
    }

    @Test
    public void testAmountButton() {
        WebElement amountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > button")));
        String buttonText = amountButton.getText();
        assert "Оплатить 400.00 BYN".equals(buttonText.trim());
    }

    @Test
    public void testNumberPhone() {
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > div > span")));
        String phoneText = phoneElement.getText();
        assert "Оплата: Услуги связи Номер:375297777777".equals(phoneText.trim());
    }

    @Test
    public void testNumberCard() {
        WebElement cardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c61-0 > div:nth-child(1) > app-input > div > div > div.content.ng-tns-c46-1 > label")));
        String cardNumberText = cardNumber.getText();
        assert "Номер карты".equals(cardNumberText.trim());
    }

    @Test
    public void testLogosMastercard() {
        WebElement logosMastercard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c61-0 > div:nth-child(1) > app-input > div > div > div.icons-container.ng-tns-c46-1 > div > div > img:nth-child(1)")));
        assertTrue(logosMastercard.isDisplayed());
    }

    @Test
    public void testLogosVisa() {
        WebElement logosVisa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c61-0 > div:nth-child(1) > app-input > div > div > div.icons-container.ng-tns-c46-1 > div > div > img:nth-child(2)")));
        assertTrue(logosVisa.isDisplayed());
    }

    @Test
    public void testLogosBelcart() {
        WebElement logosBelkart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]")));
        assertTrue(logosBelkart.isDisplayed());
    }

    @Test
    public void testLogosMir() {
        WebElement logosMir = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[1]")));
        assertTrue(logosMir.isDisplayed());
    }

    @Test
    public void testLogosMaestro() {
        WebElement logosMaestro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]")));
        assertTrue(logosMaestro.isDisplayed());
    }

    @Test
    public void testCvc() {
        WebElement cvc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c61-0 > div:nth-child(2) > div.cvc-input.ng-tns-c61-0.ng-star-inserted > app-input > div > div > div.content.ng-tns-c46-5 > label")));
        String cvcText = cvc.getText();
        assert "CVC".equals(cvcText.trim());
    }

    @Test
    public void testCardholderName() {
        WebElement cardholderName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c61-0 > div:nth-child(3) > app-input > div > div > div.content.ng-tns-c46-3 > label")));
        String cardholderText = cardholderName.getText();
        assert "Имя держателя (как на карте)".equals(cardholderText.trim());
        driver.switchTo().defaultContent();

    }
}
