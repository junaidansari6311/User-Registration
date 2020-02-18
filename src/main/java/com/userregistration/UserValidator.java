package com.userregistration;

import java.util.regex.Pattern;
    public class UserValidator {
        private static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,}";
        private static final String EMAIL_PATTERN = "^[A-Za-z]{3,}([-|+|.]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4})?$";
        public static boolean validateName(String name) {
            if (name.matches(NAME_PATTERN)) {
                return true;
            }
            return false;
        }

        public static boolean validateEmailAddress(String email) {
            if (email.matches(EMAIL_PATTERN)) {
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println("WELCOME TO USER REGISTRATION");
        }

    }

