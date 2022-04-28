package helpers.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverListener extends AbstractWebDriverEventListener {
    private static final Logger logger = LoggerFactory.getLogger(DriverListener.class);

    public static DriverListener setup(EventFiringWebDriver driver) {
        DriverListener instance = new DriverListener();
        driver.register(instance);
        return instance;
    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeFindBy <<<<<<<<<<<<<<<<<<");
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> afterFindBy <<<<<<<<<<<<<<<<<<");
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeClickOn <<<<<<<<<<<<<<<<<<");
        logger.info("\n>> Element:\n" +
                ">>\tvisibility: {}\n" +
                ">>\tposition: {}\n" +
                ">>\tsize: {}", element.isDisplayed(), element.getLocation(), element.getSize());
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> afterClickOn <<<<<<<<<<<<<<<<<<");
    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeNavigateTo <<<<<<<<<<<<<<<<<<");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> afterNavigateTo <<<<<<<<<<<<<<<<<<");
    }

    public void beforeScript(String script, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeScript <<<<<<<<<<<<<<<<<<");
        logger.info(">> Executing script: '{}'", script);
    }

    public void afterScript(String script, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> afterScript <<<<<<<<<<<<<<<<<<");
    }

    public void beforeGetText(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeGetText <<<<<<<<<<<<<<<<<<");
        logger.info("\n>> Element:\n" +
                ">>\tvisibility: {}\n" +
                ">>\tposition: {}\n" +
                ">>\tsize: {}", element.isDisplayed(), element.getLocation(), element.getSize());
    }

    public void afterGetText(WebElement element, WebDriver driver, String text) {
        logger.info(">>>>>>>>>>>>>>>>>> afterGetText <<<<<<<<<<<<<<<<<<");
        logger.info(">> Got text: '{}'", text);
    }
}
