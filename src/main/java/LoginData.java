public class LoginData {
    private static String login;
    private String password;
    private String phone;
    private String code;

    public LoginData(String login, String password) {
        System.out.println("LoginData constructor call with parameters: " + login + ", " + password);

        this.login = login;
        this.password = password;
    }

    public LoginData(String login, String password, String phone, String code) {
        System.out.println("LoginData constructor call with parameters: " +
                login + ", " + password + ", " + phone + ", " + code);

        this.login = login;
        this.password = password;
        this.phone = phone;
        this.code = code;
    }


    public static String getLogin() {
        System.out.println("LoginData getLogin call: " + login);

        return login;
    }

    public String getPassword() {
        System.out.println("LoginData getPassword call: " + password);

        return this.password;
    }

    public String getPhone() {
        System.out.println("LoginData getPhone call: " + phone);

        return this.phone;
    }

    public String getCode() {
        System.out.println("LoginData getCode call: " + code);
        return this.code;
    }
}
