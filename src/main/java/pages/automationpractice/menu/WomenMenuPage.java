package pages.automationpractice.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.automationpractice.products.CategoryPage;

import static helpers.web.ElementActions.clickElement;

public class WomenMenuPage extends BasePage {

    @FindBy(css = "[title=Blouses]")
    private WebElement blousesLink;

    public WomenMenuPage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public CategoryPage goToBlouses() {
        highLight(blousesLink);
        clickElement(blousesLink);
        return new CategoryPage(driver);
    }
}
