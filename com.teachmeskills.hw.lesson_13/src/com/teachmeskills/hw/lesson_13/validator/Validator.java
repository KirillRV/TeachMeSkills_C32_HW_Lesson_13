package com.teachmeskills.hw.lesson_13.validator;
import com.teachmeskills.hw.lesson_13.exception.WrongLoginException;
import com.teachmeskills.hw.lesson_13.exception.WrongPasswordException;

public class Validator {
    public static boolean validator(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {

            if (login.length() > 19 || login.contains(" ")) {
                throw new WrongLoginException("Login should be shotter than 20 symbols and should not contain space");
            }
            if (password.length() > 19 || password.contains(" ") || !containsDigit(password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("password should have less than 20 symbols, dont have space, password should have atleast 1 digit, should be equal with confirmPassword");
            }
            return true;
        }

    private static boolean containsDigit(String string) {
        for (char a  : string.toCharArray()) {
            if (Character.isDigit(a)) {
                return true;

            }
    }
                return false;
    }
}
