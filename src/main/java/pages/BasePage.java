package pages;

import helpers.web.ElementActions;
import helpers.web.PageStatusService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {
    protected static final int TIMEOUT_S = Integer.parseInt(System.getProperty("webElement.timeOut"));
    protected static final int SLEEP_MS = Integer.parseInt(System.getProperty("webElement.polling"));
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor jse;

    public BasePage(WebDriver driver) {
        initDrivers(driver);
        PageFactory.initElements(driver, this);
    }

    public BasePage(WebDriver driver, WebElement element) {
        initDrivers(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
    }

    private void initDrivers(WebDriver driver) {
        this.driver = driver;
        this.jse = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_S), Duration.ofMillis(SLEEP_MS));
        logger.debug("Created WebDriverWait with timeout: " + TIMEOUT_S + "s and sleep: " + SLEEP_MS + "ms");
        ElementActions.init(driver);
        PageStatusService.init(wait, jse);
    }

    public void highLight(WebElement element) {
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}
