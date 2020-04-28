import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BaseClass {

    public LogInPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[text() = 'Login']")
    private WebElement searchButton;

    @FindBy(className = "text-align-left")
    private WebElement accountText;

    public LogInPage setUserName(String value)
    {
        userName.sendKeys(value);
        return this;
    }

    public LogInPage setPassword(String value)
    {
        password.sendKeys(value);
        return this;
    }

    public LogInPage clickSearchButton()
    {
        searchButton.click();
        return this;
    }

    public String getAccountText()
    {
        return this.accountText.getText();
    }

}