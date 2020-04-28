import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;

    public BaseClass(){

    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void waitMethod(){
        driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
    }

    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }

    public HomePage openHomePage() {
        beforeTest();
        driver.get("https://www.phptravels.net/home");
        return new HomePage(driver);
    }

    public void afterTest(){
        driver.quit();
    }

}
