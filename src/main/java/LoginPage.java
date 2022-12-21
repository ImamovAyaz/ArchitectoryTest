public class LoginPage extends BasePage {

    private WebElement login_eb = new WebElement("Login Edit Box locator");
    private WebElement password_eb = new WebElement("Password Edit Box locator");
    private WebElement phone_eb = new WebElement("Phone Edit Box locator");
    private WebElement code_eb = new WebElement("Code Edit Box locator");
    private WebElement submit_button = new WebElement("Submit Button locator");


    public LoginPage() {
        System.out.println("LoginPage default constructor call");
    }

    public void login(LoginData ld) {
        System.out.println("LoginPage login call with parameter:" + ld.toString());

        enterLogin(LoginData.getLogin());
        enterPassword(ld.getPassword());

        enterPhone(ld.getPhone());
        enterCode(ld.getCode());

        submitLoginClick();
    }

    private void enterCode(String code) {
        System.out.println("LoginPage enterCode call with parameter:" + code);

        getDriver();
        code_eb.enterText(code);
    }

    private void enterPhone(String phone) {
        System.out.println("LoginPage enterPhone call with parameter:" + phone);

        getDriver();
        phone_eb.enterText(phone);
    }

    public void enterLogin(String login) {
        System.out.println("LoginPage enterLogin call with parameter:" + login);

        getDriver();
        login_eb.enterText(login);
    }

    public void enterPassword(String password) {
        System.out.println("LoginPage enterPassword call with parameter:" + password);

        getDriver();
        password_eb.enterText(password);
        System.out.println("EnterPassword");
    }

    public void submitLoginClick() {

        getDriver();
        submit_button.Click();
        System.out.println("SubmitLoginClick");
    }
}
