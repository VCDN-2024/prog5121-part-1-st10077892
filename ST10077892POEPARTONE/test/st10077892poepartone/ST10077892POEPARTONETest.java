package st10077892poepartone;

import org.junit.Test;
import static org.junit.Assert.*;

public class ST10077892POEPARTONETest {
    
      @Test
    public void checkUsernameValid() {
        login user = new login();
        assertTrue(user.checkUserName("kyl_1"));  
    }
   

    @Test
    public void checkUsernameNotValid() {
        login user = new login();
        assertFalse(user.checkUserName("kyle!!!!!"));
    }

    @Test
    public void checkPasswordComplexityValid() {
        login user = new login();
        assertTrue(user.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void checkPasswordComplexityNotValid() {
        login user = new login();
        assertFalse(user.checkPasswordComplexity("password"));
    }

    @Test
    public void checkRegisterUserSuccess() {
       login user = new login(); 
       String registrationMessage = user.registerUser("kyl_1", "Ch&&sec@ke99!");
    }

    @Test
    public void checkRegisterUserUnsuccessful() {
        login user = new login();
        String registrationMessage = user.registerUser("kyle!!!!", "password");
    }

    @Test
    public void checkLoginUserSuccessful() {
        login user = new login();
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!","kyl_1" ,"Ch&&sec@ke99!" ));
    }

    @Test
    public void checkLoginUserUnsuccessful() {
        login user = new login();
        assertTrue(user.loginUser("kyle!!!!", "password","kyle!!!!" ,"password" ));
    }

    @Test
    public void checkReturnLoginStatusSuccessful() {
        login user = new login();
        assertEquals("Successful Login" , user.returnLoginStatus(true));
    }

    @Test
    public void checkReturnLoginStatusUnsuccessful() {
        login user = new login();
        assertEquals("Failed Login" , user.returnLoginStatus(false));
    }
}

