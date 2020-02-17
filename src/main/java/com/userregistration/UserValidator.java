package com.userregistration;

import java.util.regex.Pattern;
    public class UserValidator {
        private static final String NAME_PATTERN="[A-Z]{1}[a-z]{2,}";
        public static boolean validateFirstName(String fname) {
            if(Pattern.matches(NAME_PATTERN,fname)) {
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION");
    }
}
