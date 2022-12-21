public class WebElement {
    public WebElement(String locator){
        System.out.println("WebElement constructor call with parameters: " + locator);
    }

    public void enterText(String text) {
        System.out.println("WebElement enterText call with parameter: " + text);
    }

    public void Click() {
        System.out.println("WebElement Click call");

    }

    public void isAvailable() {
        System.out.println("WebElement isAvailable call");

    }

    public boolean isVisible() {
        System.out.println("WebElement isVisible call");

        return true;
    }

    public boolean isClickable() {
        System.out.println("WebElement isClickable call");

        return true;
    }
}
