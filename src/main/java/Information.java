import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Information {

    final String actualDatePlusMonth;
    final String hotelsExpectedResult;

    //HotelsPage information
    final String hotelsDestination;
    final String actualDate;

    //FlightsPage information
    final String flightsFromValue;
    final String flightsToValue;
    final String flightsExpectedResult;

    //ToursPage information
    final String toursDestination;
    final String toursExpectedResult;

    //SignUpPage
    final String email;
    final String firstName;
    final String lastName;
    final String phone;
    final String password;
    final String signUpExpectedResult;

    //LogInPage
    final String userName;
    final String userPassword;
    final String loginExpectedResult;

    //Visa
    final String visaFirstName;
    final String visaLastName;
    final String visaEmail;
    final String visaPhone;
    final String visaFromCountry;
    final String visaToCountry;
    final String visaExpectedResult;

    public Information() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        calendar.add(Calendar.MONTH,1);
        Date currentDatePlusOneMonth = calendar.getTime();

        calendar.add(Calendar.MONTH,1);
        Date currentDatePlusTwoMonth = calendar.getTime();

        actualDate = dateFormat.format(currentDatePlusOneMonth);
        actualDatePlusMonth = dateFormat.format(currentDatePlusTwoMonth);

        //Sign up
        Random random = new Random();
        email = "ford"+random.nextInt(100)+"@gmail.com";
        firstName = "Henry";
        lastName = "Ford";
        phone = "3414141";
        password = "12345678";
        signUpExpectedResult = "Hi, Henry Ford";

        //Login
        userName = "user@phptravels.com";
        userPassword = "demouser";
        loginExpectedResult = "Hi, Demo User";

        //HotelsPage
        hotelsDestination = "Lviv";
        hotelsExpectedResult = "HotelsPage Lviv";

        //FlightsPage
        flightsFromValue = "KRK";
        flightsToValue = "IEV";
        flightsExpectedResult = "KRK to IEV";

        //ToursPage
        toursDestination = "Kiev";
        toursExpectedResult = "Kiev";

        //Visa
        visaFirstName = "Andrew";
        visaLastName = "Worski";
        visaEmail = "worski123@gmail.com";
        visaPhone = "12321312";
        visaFromCountry = "Ukraine";
        visaToCountry = "Poland";
        visaExpectedResult = "Visa Submitted";
    }

}

