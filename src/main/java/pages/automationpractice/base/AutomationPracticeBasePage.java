package pages.automationpractice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public abstract class AutomationPracticeBasePage extends BasePage {

    @FindBy(css = "#header")
    private WebElement header;

    @FindBy(css = "#footer")
    private WebElement footer;

    public AutomationPracticeBasePage(WebDriver driver) {
        super(driver);
    }

    public FooterPage inFooter() {
        return new FooterPage(driver, footer);
    }

    public HeaderPage inHeader() {
        return new HeaderPage(driver, header);
    }
}