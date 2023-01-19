import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    static private WebElement important_label = new WebElement("Importnt Label locator");
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    static private boolean isLabelAvaliable() {
        log.info("HomePage isLabelAvaliable call");
        getDriver();
        return important_label.isVisible() && important_label.isClickable();
    }

    static public boolean isImportantLabelAvaliable() {
        important_label.isAvailable();
        log.info("HomePage isImportantLabelAvaliable call");
        return isLabelAvaliable();
    }
}
