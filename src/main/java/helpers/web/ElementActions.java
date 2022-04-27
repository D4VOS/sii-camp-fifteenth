package helpers.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementActions {
    private static final Logger logger = LoggerFactory.getLogger(ElementActions.class);

    public static void clickElement(WebElement element) {
        logger.info("Click on element located at " + element.getLocation());
        element.click();
    }

    public static void hoverElement(WebElement element, WebDriver driver) {
        logger.info("Hover element located at " + element.getLocation());
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
