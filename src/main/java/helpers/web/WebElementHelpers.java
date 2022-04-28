package helpers.web;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class WebElementHelpers {
    public static boolean isVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException err) {
            return false;
        }
    }
}
