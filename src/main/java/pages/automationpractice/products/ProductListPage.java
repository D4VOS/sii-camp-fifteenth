package pages.automationpractice.products;

import exceptions.NotFoundMatchingOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class ProductListPage extends BasePage {

    @FindBy(css = ".product-container")
    private List<WebElement> productTiles;

    public ProductListPage(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public ProductTilePage getFirst() {
        return getAll().stream()
                .findFirst()
                .orElseThrow(() -> new NotFoundMatchingOption("There is any product in grid"));
    }

    public List<ProductTilePage> getAll() {
        return productTiles.stream()
                .map(p -> new ProductTilePage(driver, p))
                .collect(Collectors.toList());
    }
}
