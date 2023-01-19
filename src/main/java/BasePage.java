import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;

public class BasePage {
    static private WebDriver driver = new WebDriver(); //NOTE: temporary solution
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    public BasePage() {
        log.info("BasePage default constructor call");
    }

    static protected WebDriver getDriver() {
        log.info("BasePage getDriver constructor call");
        return driver;
    }
}
