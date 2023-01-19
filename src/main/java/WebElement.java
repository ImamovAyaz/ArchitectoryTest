import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebElement {
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    public WebElement(String locator) {
        log.info("WebElement constructor call with parameters: " + locator);
    }

    public void enterText(String text) {
        log.info("WebElement enterText call with parameter: " + text);
    }

    public void Click() {
        log.info("WebElement Click call");
    }

    public void isAvailable() {
        log.info("WebElement isAvailable call");
    }

    public boolean isVisible() {
        log.info("WebElement isVisible call");
        return true;
    }

    public boolean isClickable() {
        log.info("WebElement isClickable call");
        return true;
    }
}
