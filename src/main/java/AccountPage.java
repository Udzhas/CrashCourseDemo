import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage  extends BaseClass {
    public AccountPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css="a[href='#profile']")
    private WebElement my_Profile;
    @FindBy(css="a[href='#wishlist']")
    private WebElement wishlist;
    @FindBy(css="a[href='#newsletter']")
    private WebElement newsLetter;
    @FindBy(css="a[href='#bookings']")
    private WebElement bookings;
    //This elements are workable when u  clicked on My Profile

    @FindBy(name = "email")
    private  WebElement emailField;
    @FindBy(name = "password")
    private  WebElement passwordField;
    @FindBy(name = "confirmpassword")
    private  WebElement confirmPasswordField;
    @FindBy(name = "address1")
    private  WebElement addressField;
    @FindBy(name = "address2")
    private  WebElement address2Field;
    @FindBy(name = "city")
    private  WebElement cityField;
    @FindBy(name = "state")
    private  WebElement stateField;
    @FindBy(name = "zip")
    private  WebElement postalZipCodeField;
    @FindBy(name = "phone")
    private  WebElement phoneField;
    @FindBy(className= "chosen-single")
    private  WebElement selectCountryBox;
    @FindBy(className = "chosen-search-input")
    private WebElement countryField;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitButton;

    //slider
    @FindBy(className = "slider")
    private WebElement slider;
    //back to up
    @FindBy(id="back-to-top")
    private WebElement backToTopButton;
    //UserName
    @FindBy(className = "text-align-left") //*NEW*
    private  WebElement userName;
    //log-out Page

    @FindBy(className = "dropdown-login")
    private WebElement dropdownLogin;
    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    //Logo (ref to homepage)
    @FindBy(xpath = "//img[@alt='My Account']/..")
    private  WebElement topLeftLogo;
    //logout
    public LogInPage logOut(){
        this.dropdownLogin.click();
        this.logoutButton.click();
        return new LogInPage(driver);
    }

    //return Main Entry Name of User on Account Page
    public String getText_UserName(){
        return this.userName.getText();

    }
    //wishlist
    @FindBy(css=".panel-body.mywishlist")
    private WebElement wishElement;
    public String getText_WishList(){
        return wishElement.getText();
    }

    //tabs Open methods
    public AccountPage openMy_Profile(){ this.my_Profile.click(); return this; }
    public AccountPage openWishlist(){ this.wishlist.click(); return this; }
    public AccountPage openNewsLetter(){ this.newsLetter.click(); return this; }
    public AccountPage openBookings(){ this.bookings.click(); return this; }

    // input fields
    public String getText_address1(){
        this.my_Profile.click();
        return this.addressField.getText();
    }
    public AccountPage set_Address1(String value){
        this.addressField.click();
        this.addressField.sendKeys(value);
        return this;
    }
    public AccountPage set_Address2(String value){
        this.address2Field.click();
        this.address2Field.sendKeys(value);
        return this;
    }
    public  AccountPage changePassword(String password){
        this.my_Profile.click();
        this.passwordField.sendKeys(password);
        this.confirmPasswordField.sendKeys(password);
        return this;
    }
    public AccountPage click_Submit(){
        this.submitButton.click();
        return this;
    }
    public AccountPage set_City(String value){
        this.cityField.click();
        this.cityField.sendKeys(value);
        return this;
    }
    public AccountPage set_ZipPostalCode(String value){
        this.postalZipCodeField.click();
        this.postalZipCodeField.sendKeys(value);
        return this;
    }
    public AccountPage set_State(String value){
        this.stateField.click();
        this.stateField.sendKeys(value);
        return this;
    }
    public AccountPage set_email(String value){
        this.emailField.click();
        this.emailField.sendKeys(value);
        return this;
    }
    public AccountPage set_Country(String value){
        this.selectCountryBox.click();
        this.countryField.sendKeys(value );
        this.countryField.sendKeys(Keys.ENTER);
        return this;
    }
    public AccountPage set_phone(String value){
        this.phoneField.click();
        this.phoneField.sendKeys(value);
        return this;
    }
    public AccountPage topOfPage(){
        this.backToTopButton.click();
        return this;
    }
    public AccountPage subscribeSlider(){
        this.newsLetter.click();
        this.slider.click();
        return this;
    }
    public HomePage backToHomePage(){
        this.topLeftLogo.click();
        return new HomePage(driver);
    }




}
