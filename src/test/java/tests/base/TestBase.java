package tests.base;

import config.properties.BrowserEnvironment;
import config.properties.EnvironmentProperty;
import helpers.listeners.DriverListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@Execution(ExecutionMode.CONCURRENT)
public abstract class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    static BrowserEnvironment browserEnvironment;
    static EnvironmentProperty environmentProperty;
    protected WebDriver driverEngine;
    protected EventFiringWebDriver driver;


    @BeforeAll
    static void beforeAll() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = environmentProperty.getBrowserEnv();

        WebDriverManager.chromedriver().setup();
        logger.info("Driver initiated properly");
    }

    public static EnvironmentProperty getEnv() {
        return environmentProperty;
    }

    @BeforeEach
    void setUp() {
        driverEngine = browserEnvironment.getDriver();
        driver = new EventFiringWebDriver(driverEngine);
        DriverListener.setup(driver);

        MDC.put("driverId", "(Driver: " + driver.hashCode() + ')');
        logger.info("Created and maximized driver properly");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        logger.info("Driver closed properly");
    }
}
