package pages.automationpractice.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static helpers.web.ElementActions.clickElement;

public class ProductTilePage extends BasePage {

    @FindBy(css = ".product-name")
    private WebElement name;

    public ProductTilePage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public ProductPage view() {
        clickElement(name);
        return new ProductPage(driver);
    }
}
