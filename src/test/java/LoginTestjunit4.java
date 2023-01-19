import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;


public class LoginTestjunit4 extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    @Test
    public void loginTest() throws IOException {
        FileReader file = new FileReader(".idea/LoginPassword");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        log.info("Данные из файла: " + line);

        while (line != null) {
            String[] array = line.split(";");
            //LoginData ld = new LoginData(array[0], array[1]);
            LoginData ld = new LoginData("login", "password", "+7999", "1234");
            LoginPage loginPage = new LoginPage();
            loginPage.login(ld);
            log.info("Логин/Пароль:" + array[0] + "/" + array[1]);

            assertTrue(HomePage.isImportantLabelAvaliable());
            line = reader.readLine();
        }
    }
}
