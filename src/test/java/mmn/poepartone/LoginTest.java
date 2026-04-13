/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mmn.poepartone;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @Test
    public void testCheckUsernameComplexitytrue() {
        System.out.println("checkUsernameComplexity");
        String username = "kyl_";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsernameComplexity(username);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckUsernameComplexityfalse() {
        System.out.println("checkUsernameComplexity");
        String username = "kyl!!!!!!!!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsernameComplexity(username);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCheckPasswordComplexityTrue() {
        System.out.println("CheckPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.CheckPasswordComplexity(password);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testCheckPasswordComplexityFalse() {
        System.out.println("CheckPasswordComplexity");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.CheckPasswordComplexity(password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of LoginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        String Username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.LoginUser(Username, password);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of RegisterUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        String username = "kyl_";
        String Password = "Ch&&sec@ke99!";
        Login instance = new Login();
        String expResult = "Registration successful";
        String result = instance.RegisterUser(username, Password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of CheckPhoneNumberComplexity method, of class Login.
     */
    @Test
    public void testCheckPhoneNumberComplexityTrue() {
        System.out.println("CheckPhoneNumberComplexity");
        String phone_number = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.CheckPhoneNumberComplexity(phone_number);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testCheckPhoneNumberComplexityFalse() {
        System.out.println("CheckPhoneNumberComplexity");
        String phone_number = "08966553";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.CheckPhoneNumberComplexity(phone_number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ReturnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("ReturnLoginStatus");
        boolean loginSuccessful = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.ReturnLoginStatus(loginSuccessful);
        assertEquals(expResult, result);
        
    }
    
}
