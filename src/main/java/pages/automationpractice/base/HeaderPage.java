package pages.automationpractice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.automationpractice.menu.WomenMenuPage;

import static helpers.web.ElementActions.hoverElement;

public class HeaderPage extends BasePage {

    @FindBy(css = "a[title=Women]")
    private WebElement womenTile;

    @FindBy(css = "a[title=Dresses]")
    private WebElement dressesTile;

    @FindBy(css = "a[title=T-shirts]")
    private WebElement tShirtsTile;

    @FindBy(css = "li.sfHover")
    private WebElement subMenu;

    public HeaderPage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public WomenMenuPage inWomenMenu() {
        hoverCategoryTile(womenTile);
        return new WomenMenuPage(driver, subMenu);
    }

    private void hoverCategoryTile(WebElement tile) {
        hoverElement(tile);
    }
}
