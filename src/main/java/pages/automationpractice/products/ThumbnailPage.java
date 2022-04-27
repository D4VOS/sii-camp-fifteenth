package pages.automationpractice.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static helpers.web.ElementActions.hoverElement;

public class ThumbnailPage extends BasePage {

    @FindBy(css = "a")
    private WebElement link;

    public ThumbnailPage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public String getSource() {
        return link.getAttribute("href").replaceAll("(.*)(img/p/\\d/\\d)(.*)", "$2");
    }

    public void hover() {
        hoverElement(link, driver);
    }
}
