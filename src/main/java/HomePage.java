import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By declineCookieButton = By.cssSelector("button.btn.cookie__cancel[data-close]");
    private By titleLocator = By.cssSelector("section.pay h2");
    private By logosElement = By.cssSelector("div.pay__partners img");
    private By detailsLink = By.cssSelector("section.pay a[href*=\"poryadok-oplaty-i-bezopasnost-internet-platezhey\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://mts.by");
        driver.findElement(declineCookieButton).click();
    }

    public String getBlockTitle() {
        return driver.findElement(titleLocator).getText();
    }

    public boolean isLogosDisplayed() {
        return driver.findElement(logosElement).isDisplayed();
    }

    public void clickOnDetailsLink() {
        WebElement link = driver.findElement(detailsLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
        link.click();
    }
}


