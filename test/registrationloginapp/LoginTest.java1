package registrationloginapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testCorrectUsername() {

        Login login = new Login(
                "kyl_1",
                "Password1!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertTrue(login.checkUserName());
    }

    @Test
    public void testIncorrectUsername() {

        Login login = new Login(
                "kyle123",
                "Password1!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertFalse(login.checkUserName());
    }

    @Test
    public void testPasswordComplexitySuccess() {

        Login login = new Login(
                "kyl_1",
                "Ch&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testPasswordComplexityFailure() {

        Login login = new Login(
                "kyl_1",
                "password",
                "+27838968976",
                "Kyle",
                "Smith");

        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testCellPhoneNumberSuccess() {

        Login login = new Login(
                "kyl_1",
                "Password1!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCellPhoneNumberFailure() {

        Login login = new Login(
                "kyl_1",
                "Password1!",
                "08966553",
                "Kyle",
                "Smith");

        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccess() {

        Login login = new Login(
                "kyl_1",
                "Password1!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertTrue(
                login.loginUser(
                        "kyl_1",
                        "Password1!")
        );
    }

    @Test
    public void testLoginFailure() {

        Login login = new Login(
                "kyl_1",
                "Password1!",
                "+27838968976",
                "Kyle",
                "Smith");

        assertFalse(
                login.loginUser(
                        "wrong",
                        "wrong")
        );
    }
}