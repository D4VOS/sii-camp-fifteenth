package helpers.web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageStatusService {

    private static WebDriverWait wait;
    private static JavascriptExecutor jse;

    public static boolean isDOMLoaded() {
        String state = jse.executeScript("return document.readyState").toString();
        return state.equals("complete");
    }

    public static boolean isAjaxCompletedTasks() {
        String state = jse.executeScript("return jQuery.active").toString();
        return state.equals("0");
    }

    public static void waitForPageToLoad() {
        wait.until(driver -> isPageLoaded());
    }

    public static boolean isPageLoaded() {
        return isDOMLoaded() && isAjaxCompletedTasks();
    }

    public static void init(WebDriverWait waitDriver, JavascriptExecutor jseDriver) {
        wait = waitDriver;
        jse = jseDriver;
    }
}
