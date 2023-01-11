import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;


public class LoginTestjunit4 extends BaseTest {
    @Test
    public void loginTest() {
        try (FileReader file = new FileReader(".idea/LoginPassword")) {
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            System.out.println(line);

            while (line != null) {
                String[] array = line.split(";");
                //LoginData ld = new LoginData(array[0], array[1]);
                LoginData ld = new LoginData("login", "password", "+7999", "1234");
                LoginPage loginPage = new LoginPage();
                loginPage.login(ld);
                System.out.println("Логин/Пароль:" + array[0] + "/" + array[1]);

                assertTrue(HomePage.isImportantLabelAvaliable());
                line = reader.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
