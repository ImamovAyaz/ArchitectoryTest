import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LoginTestTestNG extends BaseTest {
    @DataProvider(name = "credentials") // Создаем метод-провайдер
    public Object[][] getDataFromDataprovider() {
        return new Object[][]{
                {"login1", "password1"},
                {"login2", "password2"},
                {"login3", "password3"}
        };
    }
    @Test(dataProvider = "credentials")
    public void loginTest(String login, String password) {
        // TODO: Add reading from default input file
        // TODO***: Add xml serialization \ deSerialization for LoginData
        // 3A Rule

        LoginData ld = new LoginData(login, password, "+7999", "1234");
        LoginPage loginPage = new LoginPage();
        loginPage.login(ld);
        System.out.println("Логин/Пароль:" + LoginData.getLogin() + "/" + ld.getPassword());

        Assert.assertTrue(HomePage.isImportantLabelAvaliable());

       /* try (FileReader file = new FileReader(".idea/LoginPassword")) {
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

                Assert.assertTrue(HomePage.isImportantLabelAvaliable());
                line = reader.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

    }
}
