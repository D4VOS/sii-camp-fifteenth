package pages.automationpractice.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.automationpractice.base.AutomationPracticeBasePage;

public class CategoryPage extends AutomationPracticeBasePage {

    @FindBy(css = ".product_list")
    private WebElement productGrid;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public ProductListPage products() {
        highLight(productGrid);
        return new ProductListPage(driver, productGrid);
    }
}
