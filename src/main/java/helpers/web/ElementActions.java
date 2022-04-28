package helpers.web;

import helpers.listeners.DriverListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static helpers.web.PageStatusService.waitForPageToLoad;

public class ElementActions {
    private static final Logger logger = LoggerFactory.getLogger(ElementActions.class);
    private static WebDriver driver;
    private static EventFiringMouse firingMouse;

    public static void init(WebDriver driver) {
        ElementActions.driver = driver;
        firingMouse = new EventFiringMouse(driver, new DriverListener());
    }

    public static void clickElement(WebElement element) {
        waitForPageToLoad();
        logger.info("Click on element located at " + element.getLocation());
        element.click();
    }

    public static void hoverElement(WebElement element) {
        waitForPageToLoad();
        logger.info("Hover element located at " + element.getLocation());
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
        Coordinates coords = ((Locatable) element).getCoordinates();
        firingMouse.mouseMove(coords);
    }
}
