public class HomePage extends BasePage{
    static private WebElement important_label = new WebElement("Importnt Label locator");
    static private boolean isLabelAvaliable(){
        System.out.println("HomePage isLabelAvaliable call");
        getDriver();
        return important_label.isVisible() && important_label.isClickable();
    }


    static public boolean isImportantLabelAvaliable(){
        important_label.isAvailable();
        System.out.println("HomePage isImportantLabelAvaliable call");
        return isLabelAvaliable();
    }
}
