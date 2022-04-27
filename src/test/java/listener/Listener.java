package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Listener extends AbstractWebDriverEventListener {
    private static final Logger logger = LoggerFactory.getLogger(Listener.class);

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeFindBy <<<<<<<<<<<<<<<<<<");
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> afterFindBy <<<<<<<<<<<<<<<<<<");
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>> beforeClickOn <<<<<<<<<<<<<<<<<<");
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
}
