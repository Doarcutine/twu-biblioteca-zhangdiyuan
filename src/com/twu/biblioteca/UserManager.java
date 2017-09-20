package com.twu.biblioteca;

/**
 * Created by Doarcutine on 2017/9/20.
 */
public class UserManager {
    public boolean LoginValidate(String libraryNumber, String password) {
        if (libraryNumber.equals("abc-123") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
