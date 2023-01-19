import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginData {
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);
    private static String login;
    private String password;
    private String phone;
    private String code;

    public LoginData(String login, String password) {
        log.info("LoginData constructor call with parameters: " + login + ", " + password);

        this.login = login;
        this.password = password;
    }

    public LoginData(String login, String password, String phone, String code) {
        log.info("LoginData constructor call with parameters: " +
                login + ", " + password + ", " + phone + ", " + code);

        this.login = login;
        this.password = password;
        this.phone = phone;
        this.code = code;
    }


    public static String getLogin() {
        log.info("LoginData getLogin call: " + login);

        return login;
    }

    public String getPassword() {
        log.info("LoginData getPassword call: " + password);

        return this.password;
    }

    public String getPhone() {
        log.info("LoginData getPhone call: " + phone);

        return this.phone;
    }

    public String getCode() {
        log.info("LoginData getCode call: " + code);

        return this.code;
    }
}
