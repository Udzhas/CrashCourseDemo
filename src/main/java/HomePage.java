import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(){

    }

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //HotelsPage search
    @FindBy(xpath = "//a[@href='#hotels']")
    private WebElement hotelsButton;

    @FindBy(id = "s2id_autogen1")
    private WebElement hotelsDestinationField;

    @FindBy(xpath = "//div[@id='select2-drop']/div/input")
    private WebElement hotelsDestination;

    @FindBy(xpath = "//ul[@class='select2-result-sub']/li/div")
    private WebElement hotelsDropDownItem;

    @FindBy(id = "checkin")
    private WebElement hotelsCheckInDate;

    @FindBy(id = "checkout")
    private WebElement hotelsCheckOutDate;

    @FindBy(xpath = "//div[@class='hero-form-absolute']")
    private WebElement labelButton;

    @FindBy(xpath = "//div[@class='col-md-2 col-xs-12']/button")
    private WebElement hotelsSearchButton;

    @FindBy(xpath = "//*[@class='heading-title']")
    private WebElement hotelsActualResult;

    //FlightsPage search
    @FindBy(xpath = "//*[@href='#flights']")
    private WebElement flightsButton;

    @FindBy(xpath = "//*[@for='flightSearchRadio-2']")
    private WebElement flightsOneWayButton;

    @FindBy(id = "s2id_location_from")
    private WebElement flightsFromField;

    @FindBy(xpath = "//*[@id='select2-drop']/div/input")
    private WebElement flightsFromValue;

    @FindBy(xpath = "//*[@class='select2-result-label']")
    private WebElement flightsFromDropDownItem;

    @FindBy(id = "s2id_location_to")
    private WebElement flightsToField;

    @FindBy(xpath = "//*[@id='select2-drop']/div/input")
    private WebElement flightsToValue;

    @FindBy(xpath = "//li[contains(@class,'select2-result-selectable')]")
    private WebElement flightsToDropDownItem;

    @FindBy(xpath = "//*[@class='col-xs-12 col-md-12']/button")
    private WebElement flightsSearchButton;

    @FindBy(xpath = "//*[@class='heading-title']")
    private WebElement flightsActualResult;

    //ToursPage search
    @FindBy(xpath = "//*[@href='#tours']")
    private WebElement toursButton;

    @FindBy (id = "s2id_textsearch")
    private WebElement toursDestinationField;

    @FindBy (xpath = "//*[@id='select2-drop']/div")
    private WebElement toursDestination;

    @FindBy (xpath = "//*[@class='select2-match']")
    private WebElement toursDestinationDropDownMenu;

    @FindBy (id = "DateTours")
    private WebElement toursFromDate;

    @FindBy (id = "EndDateTours")
    private WebElement toursToDate;

    @FindBy (xpath = "//div[@class='col-md-3 col-xs-12']/button")
    private WebElement toursSearchButton;

    @FindBy (xpath = "//*[@class='text-primary']")
    private WebElement toursActualResult;

    //Visa
    @FindBy(xpath = "//a[@href = '#visa']")
    private WebElement visaContainerButton;

    @FindBy(xpath = "//*[@name = 'nationality_country']/..//input")
    private WebElement visaFromCountryField;

    @FindBy(xpath = "//*[@class='active-result highlighted']")
    private WebElement visaSelectFromCountry;

    @FindBy(xpath = "//label[text() = 'To Country']/..//input")
    private WebElement visaToCountryField;

    @FindBy(xpath = "//*[@class='active-result highlighted']")
    private WebElement visaSelectToCountry;

    @FindBy(name = "date")
    private WebElement visaDateField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement visaSubmitButton;

    @FindBy(xpath = "//label[text() = 'From Country']/..//a/span")
    private WebElement visaFromCountryDiv;

    @FindBy(xpath = "//label[text() = 'To Country']/..//a/span")
    private WebElement visaToCountryDiv;

    @FindBy(xpath = "//button[text() = 'Got it!']")
    private WebElement visaAcceptCookie;

    //Login methods
    @FindBy(xpath = "//a[text() = 'Login']")
    private WebElement loginElement;

    @FindBy(className = "dropdown-login")
    private WebElement loginDropDown;

    //SignUp methods
    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement signUpElement;

    //HotelsPage methods
    public HomePage goToHotelsSearchMenu(){
        this.hotelsButton.click();
        return this;
    }

    public HomePage setValueIntoHotelsDestination(String destination){
        this.hotelsDestinationField.click();
        this.hotelsDestination.sendKeys(destination);
        return this;
    }

    public HomePage selectValueFromHotelsDropDownList(){
        this.hotelsDropDownItem.click();
        return this;
    }

    public HomePage setValueIntoHotelsCheckInDate(String date){
        this.hotelsCheckInDate.click();
        this.hotelsCheckInDate.clear();
        this.hotelsCheckInDate.sendKeys(date);
        return this;
    }

    public HomePage setValueIntoHotelsCheckOutDate(String date){
        this.hotelsCheckOutDate.click();
        this.hotelsCheckOutDate.clear();
        this.hotelsCheckOutDate.sendKeys(date);
        return this;
    }

    public HomePage clickSearchHotel(){
        this.labelButton.click();
        this.hotelsSearchButton.click();
        return this;
    }

    public String getHotelsConfirmationText(){
        return this.hotelsActualResult.getText();
    }

    //FlightsPage methods
    public HomePage goToFlightsSearchMenu(){
        this.flightsButton.click();
        return this;
    }

    public HomePage chooseFlightsType(){
        this.flightsOneWayButton.click();
        return this;
    }

    public HomePage setValueIntoFlightsFromField(String fromField){
        this.flightsFromField.click();
        this.flightsFromValue.sendKeys(fromField);
        this.waitMethod();
        this.flightsFromDropDownItem.click();
        return this;
    }

    public HomePage setValueIntoFlightsToField(String toField){
        this.flightsToField.click();
        this.flightsToValue.sendKeys(toField);
        this.waitMethod();
        this.flightsToDropDownItem.click();
        return this;
    }

    public HomePage clickSearchFlights(){
        this.flightsSearchButton.click();
        return this;
    }

    public String getFlightsConfirmationText(){
        return this.flightsActualResult.getText();
    }

    //ToursPage methods
    public HomePage goToToursSearchMenu(){
        this.toursButton.click();
        return this;
    }

    public HomePage setValueIntoToursDestination(String destination){
        this.toursDestinationField.click();
        this.driver.switchTo().activeElement().sendKeys(destination);
        return this;
    }

    public HomePage selectFromToursDropDownList(){
        this.toursDestinationDropDownMenu.click();
        return this;
    }

    public HomePage setValueIntoToursToDate(String toDate){
        this.toursToDate.click();
        this.toursToDate.clear();
        this.driver.switchTo().activeElement().sendKeys(toDate);
        return this;
    }

    public HomePage setValueIntoToursFromDate(String fromDate){
        this.toursFromDate.click();
        this.toursFromDate.clear();
        this.driver.switchTo().activeElement().sendKeys(fromDate);
        return this;
    }

    public HomePage clickToursSearchButton(){
        this.labelButton.click();
        this.toursSearchButton.click();
        return this;
    }

    public String getToursConfirmationText(){
        return this.toursActualResult.getText();
    }

    //Login method
    public LogInPage goToLoginPage() {
        this.loginDropDown.click();
        this.loginElement.click();
        return new LogInPage(driver);
    }

    //SignUpPage method
    public SignUpPage goToSignUpPage() {
        this.loginDropDown.click();
        this.signUpElement.click();
        return new SignUpPage(driver);
    }

    //Visa methods
    public HomePage clickVisaContainerButton(){
        visaContainerButton.click();
        return new HomePage(driver);
    }

    private HomePage setVisaFromCountryField(String fromCountry) {
        this.visaFromCountryField.sendKeys(fromCountry);
        return this;
    }

    public HomePage selectVisaFromCountryField(String fromCountry) {
        visaFromCountryDiv.click();
        setVisaFromCountryField(fromCountry);
        this.visaSelectFromCountry.click();
        return this;
    }

    private HomePage setVisaToCountryField(String toCountry) {
        this.visaToCountryField.sendKeys(toCountry);
        return this;
    }

    public HomePage selectVisaToCountryField(String toCountry) {
        visaToCountryDiv.click();
        setVisaToCountryField(toCountry);
        this.visaSelectToCountry.click();
        return this;
    }

    public HomePage setDate(String date){
        visaDateField.click();
        visaDateField.sendKeys(date);
        this.labelButton.click();
        return this;
    }

    public VisaPage clickSubmitButton() {
        visaAcceptCookie.click();
        visaSubmitButton.click();
        return new VisaPage(driver);
    }

    public VisaPage goToVisaPage() {
        return new VisaPage(driver);
    }


}
