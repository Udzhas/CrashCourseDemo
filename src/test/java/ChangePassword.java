import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePassword {
    @Test
    @Description("Changes password and checks has it changed")
    public void test1(){
        String actualresult;
        String newpassword="098765";
        String username_login="alextest5@ukr.net";
       BaseClass bsc=new BaseClass();
       actualresult=bsc.openHomePage()
               .goToLoginPage()
               .setUserName(username_login)
               .setPassword("123456")
               .clickSearchButton()
               .changePassword(newpassword)
               .logOut()
               .setUserName(username_login)
               .setPassword(newpassword)
               .clickSearchButton()
               .getText_UserName();

        Assert.assertEquals(actualresult,"Hi, Alex Meinhom");
    }
}
