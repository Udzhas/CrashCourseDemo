import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class VisaPage extends BaseClass {

    public VisaPage() {
    }


    public VisaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

}