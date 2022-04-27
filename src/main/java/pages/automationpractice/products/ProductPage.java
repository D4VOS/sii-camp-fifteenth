package pages.automationpractice.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.automationpractice.base.AutomationPracticeBasePage;

import java.util.List;
import java.util.stream.Collectors;

public class ProductPage extends AutomationPracticeBasePage {

    @FindBy(css = "#bigpic")
    private WebElement mainImage;

    @FindBy(css = "#thumbs_list_frame > li")
    private List<WebElement> thumbnails;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public List<ThumbnailPage> getThumbnails() {
        return thumbnails.stream()
                .map(t -> new ThumbnailPage(driver, t))
                .collect(Collectors.toList());
    }

    public String getCurrentImageSource() {
        return mainImage.getAttribute("src").replaceAll("(.*)(img/p/\\d/\\d)(.*)", "$2");
    }
}
