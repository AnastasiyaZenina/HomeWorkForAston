import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private WebDriver driver;
    private By dropdownList = By.xpath("//div[contains(@class, 'select__wrapper')]//span[contains(@class, 'select__arrow')]");
    private By phoneInput = By.cssSelector("input#connection-phone");
    private By sumInput = By.cssSelector("input#connection-sum");
    private By emailInput = By.cssSelector("input#connection-email");
    private By continueButton = By.cssSelector("button.button.button__default[type=\"submit\"]");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDropdownWithJS() {
        WebElement element = driver.findElement(dropdownList);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void fillPaymentForm(String phone, String sum, String email) {
        clickDropdownWithJS();
        driver.findElement(By.xpath("//p[text()='Услуги связи']")).click();
        driver.findElement(phoneInput).sendKeys(phone);
        driver.findElement(sumInput).sendKeys(sum);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(continueButton).click();
    }
}

