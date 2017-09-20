package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Created by Doarcutine on 2017/9/20.
 */
public class UserManagerTest {
    UserManager userManager = new UserManager();

    @Test
    public void LoginValidateTest() {
        String libraryNumber = "abc-123";
        String password = "123";
        assertTrue(userManager.LoginValidate(libraryNumber, password));
    }
}
